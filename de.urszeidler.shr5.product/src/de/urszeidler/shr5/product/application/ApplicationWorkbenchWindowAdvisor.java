package de.urszeidler.shr5.product.application;


import org.eclipse.swt.graphics.Point;
import org.eclipse.ui.application.ActionBarAdvisor;
import org.eclipse.ui.application.IActionBarConfigurer;
import org.eclipse.ui.application.IWorkbenchWindowConfigurer;
import org.eclipse.ui.application.WorkbenchWindowAdvisor;

import de.urszeidler.shr5.product.Activator;

/**
 * The WorkbenchWindowAdvisor class.
 * 
 * @author urs
 * 
 */
public class ApplicationWorkbenchWindowAdvisor extends WorkbenchWindowAdvisor {

    /**
     * Convinient constructor.
     * 
     * @param configurer teh {@link IWorkbenchWindowConfigurer} to use
     */
    public ApplicationWorkbenchWindowAdvisor(IWorkbenchWindowConfigurer configurer) {
        super(configurer);
    }

    /** {@inheritDoc} */
    @Override
    public ActionBarAdvisor createActionBarAdvisor(IActionBarConfigurer configurer) {
        return new ApplicationActionBarAdvisor(configurer);
    }

    /** {@inheritDoc} */
    @Override
    public void preWindowOpen() {
        final IWorkbenchWindowConfigurer configurer = getWindowConfigurer();
        configurer.setInitialSize(new Point(800, 600));
        //configurer.setShowPerspectiveBar(true);
        configurer.setShowCoolBar(false);
        configurer.setShowStatusLine(false);
        String version = Activator.getDefault().getBundle().getVersion().toString();
        configurer.setTitle("shr5rcp "+version);
        
    }
    
  }
