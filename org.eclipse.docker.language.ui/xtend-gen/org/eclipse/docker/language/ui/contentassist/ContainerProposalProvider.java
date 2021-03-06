/**
 * generated by Xtext
 */
package org.eclipse.docker.language.ui.contentassist;

import com.google.common.base.Objects;
import org.eclipse.docker.language.container.ContainerSection;
import org.eclipse.docker.language.container.Docker;
import org.eclipse.docker.language.container.ImageSection;
import org.eclipse.docker.language.ui.contentassist.AbstractContainerProposalProvider;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.text.ITextViewer;
import org.eclipse.jface.text.contentassist.ICompletionProposal;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ui.editor.contentassist.ConfigurableCompletionProposal;
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext;
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalAcceptor;
import org.eclipse.xtext.ui.editor.contentassist.ReplacementTextApplier;

/**
 * See https://www.eclipse.org/Xtext/documentation/304_ide_concepts.html#content-assist
 * on how to customize the content assistant.
 */
@SuppressWarnings("all")
public class ContainerProposalProvider extends AbstractContainerProposalProvider {
  @Override
  public void completeImage_DockerFilelocation(final EObject model, final Assignment assignment, final ContentAssistContext context, final ICompletionProposalAcceptor acceptor) {
    final ICompletionProposal createCompletionProposal1 = this.createCompletionProposal("choose file", context);
    if ((createCompletionProposal1 instanceof ConfigurableCompletionProposal)) {
      ConfigurableCompletionProposal c = ((ConfigurableCompletionProposal) createCompletionProposal1);
      c.setTextApplier(new ReplacementTextApplier() {
        @Override
        public String getActualReplacementString(final ConfigurableCompletionProposal proposal) {
          String _xblockexpression = null;
          {
            ITextViewer _viewer = context.getViewer();
            StyledText _textWidget = _viewer.getTextWidget();
            Display _display = _textWidget.getDisplay();
            Display d = ((Display) _display);
            Shell _activeShell = d.getActiveShell();
            FileDialog dialog = new FileDialog(_activeShell, SWT.OPEN);
            String g = dialog.open();
            URI _createFileURI = URI.createFileURI(g);
            String file = _createFileURI.toFileString();
            StringConcatenation _builder = new StringConcatenation();
            _builder.append("\"");
            String _replace = file.replace("\\", "\\\\");
            _builder.append(_replace, "");
            _builder.append("\"  ");
            _xblockexpression = _builder.toString();
          }
          return _xblockexpression;
        }
      });
    }
    acceptor.accept(createCompletionProposal1);
    super.completeImage_DockerFilelocation(model, assignment, context, acceptor);
  }
  
  @Override
  public void completeKeyword(final Keyword keyword, final ContentAssistContext contentAssistContext, final ICompletionProposalAcceptor acceptor) {
    String _value = keyword.getValue();
    switch (_value) {
      case "Container Section":
        boolean _and = false;
        EObject _currentModel = contentAssistContext.getCurrentModel();
        boolean _notEquals = (!Objects.equal(_currentModel, null));
        if (!_notEquals) {
          _and = false;
        } else {
          EObject _currentModel_1 = contentAssistContext.getCurrentModel();
          ContainerSection _containerRegion = ((Docker) _currentModel_1).getContainerRegion();
          boolean _equals = Objects.equal(_containerRegion, null);
          _and = _equals;
        }
        if (_and) {
          super.completeKeyword(keyword, contentAssistContext, acceptor);
        } else {
          EObject _currentModel_2 = contentAssistContext.getCurrentModel();
          boolean _equals_1 = Objects.equal(_currentModel_2, null);
          if (_equals_1) {
            super.completeKeyword(keyword, contentAssistContext, acceptor);
          } else {
            return;
          }
        }
        break;
      case "Image Section":
        boolean _and_1 = false;
        EObject _currentModel_3 = contentAssistContext.getCurrentModel();
        boolean _notEquals_1 = (!Objects.equal(_currentModel_3, null));
        if (!_notEquals_1) {
          _and_1 = false;
        } else {
          EObject _currentModel_4 = contentAssistContext.getCurrentModel();
          ImageSection _imageRegion = ((Docker) _currentModel_4).getImageRegion();
          boolean _equals_2 = Objects.equal(_imageRegion, null);
          _and_1 = _equals_2;
        }
        if (_and_1) {
          super.completeKeyword(keyword, contentAssistContext, acceptor);
        } else {
          EObject _currentModel_5 = contentAssistContext.getCurrentModel();
          boolean _equals_3 = Objects.equal(_currentModel_5, null);
          if (_equals_3) {
            super.completeKeyword(keyword, contentAssistContext, acceptor);
          } else {
            return;
          }
        }
        break;
      default:
        super.completeKeyword(keyword, contentAssistContext, acceptor);
        break;
    }
  }
}
