package dev.kaira.bitwig;

import com.bitwig.extension.api.PlatformType;
import com.bitwig.extension.controller.AutoDetectionMidiPortNamesList;
import com.bitwig.extension.controller.ControllerExtensionDefinition;
import com.bitwig.extension.controller.api.ControllerHost;

import java.util.UUID;

public class ImpactGXPExtensionDefinition extends ControllerExtensionDefinition
{
   private static final UUID DRIVER_ID = UUID.fromString("adb9657c-0cab-4969-958c-fe2529737e56");
   
   public ImpactGXPExtensionDefinition()
   {
   }

   @Override
   public String getName()
   {
      return "ImpactGXP49";
   }
   
   @Override
   public String getAuthor()
   {
      return "Kaira";
   }

   @Override
   public String getVersion()
   {
      return "0.1";
   }

   @Override
   public UUID getId()
   {
      return DRIVER_ID;
   }
   
   @Override
   public String getHardwareVendor()
   {
      return "Semantyca";
   }
   
   @Override
   public String getHardwareModel()
   {
      return "ImpactGXP49";
   }

   @Override
   public int getRequiredAPIVersion()
   {
      return 15;
   }

   @Override
   public int getNumMidiInPorts()
   {
      return 0;
   }

   @Override
   public int getNumMidiOutPorts()
   {
      return 0;
   }

   @Override
   public void listAutoDetectionMidiPortNames(final AutoDetectionMidiPortNamesList list, final PlatformType platformType)
   {
   }

   @Override
   public ImpactGXPExtension createInstance(final ControllerHost host)
   {
      return new ImpactGXPExtension(this, host);
   }
}
