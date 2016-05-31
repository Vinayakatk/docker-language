package org.eclipse.diagrams.docker;

import java.util.List;

import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;

import de.cau.cs.kieler.core.kgraph.KGraphData;
import de.cau.cs.kieler.core.kgraph.KNode;
import de.cau.cs.kieler.core.krendering.KRendering;
import de.cau.cs.kieler.core.krendering.KRenderingLibrary;
import de.cau.cs.kieler.kiml.klayoutdata.KShapeLayout;
import de.cau.cs.kieler.klighd.IUpdateStrategy;
import de.cau.cs.kieler.klighd.LightDiagramServices;
import de.cau.cs.kieler.klighd.ViewContext;
import de.cau.cs.kieler.klighd.krendering.SimpleUpdateStrategy;

public class UpdateStrategy1 extends SimpleUpdateStrategy implements IUpdateStrategy {

	public UpdateStrategy1() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public void update(KNode baseModel, KNode newModel, ViewContext viewContext) {
  final List<KNode> newChildren = Lists.newArrayList(newModel.getChildren());
        final List<KGraphData> newData = Lists.newArrayList(newModel.getData());
        newModel.getChildren().clear();
        newModel.getData().clear();
        
        // compose a collection of the baseModel's data that are to be replaced by those of newModel
        final List<KGraphData> obsoleteData =
                Lists.newArrayList(Iterables.concat(
                        Iterables.filter(baseModel.getData(), KShapeLayout.class),
                        Iterables.filter(baseModel.getData(), KRendering.class),
                        Iterables.filter(baseModel.getData(), KRenderingLibrary.class)));

        // reset the clip (here the transform difference can still be computed properly)
        if (viewContext != null && viewContext.getViewer() != null
                && viewContext.getViewer().getClip() != baseModel) {
            // viewContext.getViewer() is null if called via LightDiagramServices#translateModel(...)
            viewContext.getViewer().clip(baseModel);
        }

        // ... and remove the diagram elements afterwards
        baseModel.getChildren().clear();
        baseModel.getData().clear();
        baseModel.getData().addAll(newData);
        baseModel.getChildren().addAll(newChildren);
	}

}
