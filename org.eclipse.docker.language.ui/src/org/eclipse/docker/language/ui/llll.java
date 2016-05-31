//package org.eclipse.docker.language.ui;
//
//import java.util.Arrays;
//
//import org.eclipse.core.runtime.IProgressMonitor;
//import org.eclipse.docker.language.ui.mad.ContentProvider;
//import org.eclipse.jface.action.Action;
//import org.eclipse.jface.action.IAction;
//import org.eclipse.jface.action.IMenuCreator;
//import org.eclipse.jface.action.IMenuManager;
//import org.eclipse.jface.action.Separator;
//import org.eclipse.jface.dialogs.IMessageProvider;
//import org.eclipse.jface.layout.GridDataFactory;
//import org.eclipse.jface.resource.ImageDescriptor;
//import org.eclipse.jface.util.IPropertyChangeListener;
//import org.eclipse.jface.viewers.ArrayContentProvider;
//import org.eclipse.jface.viewers.ColumnLabelProvider;
//import org.eclipse.jface.viewers.IStructuredContentProvider;
//import org.eclipse.jface.viewers.LabelProvider;
//import org.eclipse.jface.viewers.TableViewer;
//import org.eclipse.jface.viewers.TableViewerColumn;
//import org.eclipse.jface.viewers.Viewer;
//import org.eclipse.swt.SWT;
//import org.eclipse.swt.custom.SashForm;
//import org.eclipse.swt.events.HelpListener;
//import org.eclipse.swt.events.SelectionEvent;
//import org.eclipse.swt.events.SelectionListener;
//import org.eclipse.swt.graphics.Image;
//import org.eclipse.swt.graphics.Point;
//import org.eclipse.swt.layout.FillLayout;
//import org.eclipse.swt.layout.FormAttachment;
//import org.eclipse.swt.layout.FormData;
//import org.eclipse.swt.layout.FormLayout;
//import org.eclipse.swt.layout.GridData;
//import org.eclipse.swt.layout.GridLayout;
//import org.eclipse.swt.widgets.Button;
//import org.eclipse.swt.widgets.Composite;
//import org.eclipse.swt.widgets.DirectoryDialog;
//import org.eclipse.swt.widgets.Display;
//import org.eclipse.swt.widgets.Event;
//import org.eclipse.swt.widgets.Table;
//import org.eclipse.swt.widgets.TableColumn;
//import org.eclipse.swt.widgets.Text;
//import org.eclipse.ui.IEditorInput;
//import org.eclipse.ui.IEditorSite;
//import org.eclipse.ui.ISharedImages;
//import org.eclipse.ui.PartInitException;
//import org.eclipse.ui.PlatformUI;
//import org.eclipse.ui.actions.RefreshAction;
//import org.eclipse.ui.forms.events.HyperlinkEvent;
//import org.eclipse.ui.forms.events.IHyperlinkListener;
//import org.eclipse.ui.forms.widgets.Form;
//import org.eclipse.ui.forms.widgets.FormToolkit;
//import org.eclipse.ui.forms.widgets.Hyperlink;
//import org.eclipse.ui.forms.widgets.ScrolledForm;
//import org.eclipse.ui.forms.widgets.Section;
//import org.eclipse.ui.part.EditorPart;
//import org.eclipse.wb.swt.ResourceManager;
//import org.eclipse.wb.swt.SWTResourceManager;
//import org.eclipse.xtext.ui.editor.XtextEditor;
//
//import view.views.dia;
//
//public class llll extends EditorPart {
//	public llll() {
//	}
//	private TableViewer viewer;
//	public static final String ID = "org.eclipse.docker.language.ui.llkkllkk"; //$NON-NLS-1$
//	private final FormToolkit formToolkit = new FormToolkit(Display.getDefault());
//	private Table table_1;
//
//	@Override
//	public void createPartControl(Composite parent) {
//		Composite container = new Composite(parent, SWT.NONE);
//		container.setLayout(new FillLayout(SWT.HORIZONTAL));
//
//		Form frmDockerEditor = formToolkit.createForm(container);
//		frmDockerEditor.setImage(ResourceManager.getPluginImage("org.eclipse.docker.language.ui", "icons/docker.jpg"));
//		formToolkit.paintBordersFor(frmDockerEditor);
//		frmDockerEditor.setText("Docker Editor");
//
//		// Button button = formToolkit.createButton(frmDockerEditor.getBody(),
//		// "New Button", SWT.NONE);
//
//		Hyperlink hprlnkNewHyperlink = formToolkit.createHyperlink(frmDockerEditor.getHead(), "configure", SWT.NONE);
//		// Hyperlink hprlnkNewHyperlink2 =
//		// formToolkit.createHyperlink(frmDockerEditor.getHead(), "configure2",
//		// SWT.NONE);
//		frmDockerEditor.setHeadClient(hprlnkNewHyperlink);
//		formToolkit.paintBordersFor(hprlnkNewHyperlink);
//		frmDockerEditor.getBody().setLayout(new FillLayout(SWT.HORIZONTAL));
//		hprlnkNewHyperlink.addHyperlinkListener(new IHyperlinkListener() {
//			public void linkActivated(HyperlinkEvent e) {
//				ConfigureDialog d = new ConfigureDialog(Display.getDefault().getActiveShell());
//						d.open();
//			}
//			public void linkEntered(HyperlinkEvent e) {
//			}
//			public void linkExited(HyperlinkEvent e) {
//			}
//		});
//		Section sctnNewSection = formToolkit.createSection(frmDockerEditor.getBody(),
//				Section.TWISTIE | Section.TITLE_BAR);
//		sctnNewSection.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_HIGHLIGHT_SHADOW));
//		formToolkit.paintBordersFor(sctnNewSection);
//		sctnNewSection.setText("");
//		sctnNewSection.setExpanded(true);
//
//		Button btnNewButton = formToolkit.createButton(sctnNewSection, "Connect", SWT.NONE);
//		btnNewButton.setForeground(SWTResourceManager.getColor(SWT.COLOR_TRANSPARENT));
//		btnNewButton.setImage(ResourceManager.getPluginImage("org.eclipse.docker.language.ui", "icons/docker.jpg"));
//		sctnNewSection.setTextClient(btnNewButton);
//
//		Composite composite = formToolkit.createComposite(sctnNewSection, SWT.NONE);
//		formToolkit.paintBordersFor(composite);
//		sctnNewSection.setClient(composite);
//		composite.setLayout(new FormLayout());
//		
//		Section sctnNewSection_2 = formToolkit.createSection(composite, Section.TWISTIE | Section.TITLE_BAR);
//		FormData fd_sctnNewSection_2 = new FormData();
//		fd_sctnNewSection_2.bottom = new FormAttachment(100, -15);
//		fd_sctnNewSection_2.right = new FormAttachment(100, -621);
//		fd_sctnNewSection_2.top = new FormAttachment(1);
//		fd_sctnNewSection_2.left = new FormAttachment(0);
//		sctnNewSection_2.setLayoutData(fd_sctnNewSection_2);
//		System.out.println(getPartProperties().keySet().toString());
//		formToolkit.paintBordersFor(sctnNewSection_2);
//		sctnNewSection_2.setExpanded(true);
//		
//		Composite composite_2 = formToolkit.createComposite(sctnNewSection_2, SWT.NO_REDRAW_RESIZE);
//		formToolkit.paintBordersFor(composite_2);
//		sctnNewSection_2.setClient(composite_2);
//		composite_2.setLayout(new FillLayout(SWT.HORIZONTAL));
//		
////		super.createPartControl(composite_2);
//		
//		Section sctnNewSection_1 = formToolkit.createSection(composite, Section.TWISTIE | Section.TITLE_BAR);
//		FormData fd_sctnNewSection_1 = new FormData();
//		fd_sctnNewSection_1.top = new FormAttachment(sctnNewSection_2, 0, SWT.TOP);
//		fd_sctnNewSection_1.left = new FormAttachment(sctnNewSection_2, 6);
//		fd_sctnNewSection_1.right = new FormAttachment(100);
//		fd_sctnNewSection_1.bottom = new FormAttachment(100, -6);
//		sctnNewSection_1.setLayoutData(fd_sctnNewSection_1);
//		formToolkit.paintBordersFor(sctnNewSection_1);
//		sctnNewSection_1.setExpanded(true);
//		
//		Composite composite_1 = formToolkit.createComposite(sctnNewSection_1, SWT.NONE);
//		formToolkit.paintBordersFor(composite_1);
//		sctnNewSection_1.setClient(composite_1);
//		composite_1.setLayout(new FillLayout(SWT.HORIZONTAL));
//		
//		TableViewer tableViewer = new TableViewer(composite_1, SWT.BORDER | SWT.FULL_SELECTION);
//		table_1 = tableViewer.getTable();
//		table_1.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_HIGHLIGHT_SHADOW));
//		table_1.setBackgroundMode(SWT.INHERIT_DEFAULT);
//		table_1.setCapture(true);
//		table_1.setLayoutDeferred(true);
//		table_1.setLinesVisible(true);
//		table_1.setHeaderVisible(true);
//		formToolkit.paintBordersFor(table_1);
//		
//		TableViewerColumn containerColumn = new TableViewerColumn(tableViewer, SWT.NONE);
//		TableColumn tblclmnCol = containerColumn.getColumn();
//		tblclmnCol.setImage(ResourceManager.getPluginImage("org.eclipse.docker.language.ui", "icons/docker.jpg"));
//		tblclmnCol.setMoveable(true);
//		tblclmnCol.setWidth(350);
//		tblclmnCol.setText("containers");
//		
//		TableViewerColumn statusColumn = new TableViewerColumn(tableViewer, SWT.CENTER);
//		TableColumn tblclmnCol_1 = statusColumn.getColumn();
//		tblclmnCol_1.setWidth(150);
//		tblclmnCol_1.setText("status");
//		
////		super.createPartControl(composite_2);
//		
//		
//		
//
//	}
////	private static class ContentProvider implements IStructuredContentProvider {
////		public Object[] getElements(Object inputElement) {
////			return new Object[0];
////		}
////		public void dispose() {
////		}
////		public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
////		}
////	}
//
//	@Override
//	public void doSave(IProgressMonitor monitor) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public void doSaveAs() {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public void init(IEditorSite site, IEditorInput input) throws PartInitException {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public boolean isDirty() {
//		// TODO Auto-generated method stub
//		return false;
//	}
//
//	@Override
//	public boolean isSaveAsAllowed() {
//		// TODO Auto-generated method stub
//		return false;
//	}
//
//	@Override
//	public void setFocus() {
//		// TODO Auto-generated method stub
//		
//	}
//}
