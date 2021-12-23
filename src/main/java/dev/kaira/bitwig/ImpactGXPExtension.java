package dev.kaira.bitwig;

import com.bitwig.extension.controller.ControllerExtension;
import com.bitwig.extension.controller.api.ControllerHost;

public class ImpactGXPExtension extends ControllerExtension
{
   protected ImpactGXPExtension(final ImpactGXPExtensionDefinition definition, final ControllerHost host)
   {
      super(definition, host);
   }

   @Override
   public void init()
   {
      final ControllerHost host = getHost();      

      // TODO: Perform your driver initialization here.
      // For now just show a popup notification for verification that it is running.
      host.showPopupNotification("ImpactGXP Initialized");
   }

   @Override
   public void exit()
   {
      // TODO: Perform any cleanup once the driver exits
      // For now just show a popup notification for verification that it is no longer running.
      getHost().showPopupNotification("ImpactGXP Exited");
   }

   @Override
   public void flush()
   {
      // TODO Send any updates you need here.
   }


}
