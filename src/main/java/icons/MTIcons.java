/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2018 Chris Magnussen and Elior Boukhobza
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 *
 *
 */

package icons;

import com.chrisrm.ideaddlc.icons.tinted.TintedIconsService;
import com.intellij.openapi.util.IconLoader;

import javax.swing.*;

public final class MTIcons {
  private static Icon load(final String path) {
    return IconLoader.findIcon(path);
  }
  
  public static final Icon EXCLUDED = load("/iconsddlc/mt/modules/ExcludedTreeOpen.svg");
  public static final Icon MODULE = load("/iconsddlc/mt/modules/ModuleOpen.svg");
  public static final Icon SOURCE = load("/iconsddlc/mt/modules/sourceRootOpen.svg");
  public static final Icon TEST = load("/iconsddlc/mt/modules/testRootOpen.svg");
  
  public static class Actions {
    public static Icon CloseHovered = TintedIconsService.getAccentIcon("/iconsddlc/actions/closeHovered.svg");
    public static Icon CloseNewHovered = TintedIconsService.getAccentIcon("/iconsddlc/actions/closeNewHovered.svg");
  }
  
  public static class General {
    public static Icon ExpandAllHover = TintedIconsService.getAccentIcon("/iconsddlc/general/expandAllHover.svg");
    public static Icon ExpandComponentHover = TintedIconsService.getAccentIcon("/iconsddlc/general/expandComponentHover.svg");
    public static Icon CollapseAllHover = TintedIconsService.getAccentIcon("/iconsddlc/general/collapseAllHover.svg");
    public static Icon CollapseComponentHover = TintedIconsService.getAccentIcon("/iconsddlc/general/collapseComponentHover.svg");
    
    public static Icon CopyHovered = TintedIconsService.getAccentIcon("/iconsddlc/general/copyHovered.svg");
    
    public static Icon GearHover = TintedIconsService.getAccentIcon("/iconsddlc/general/gearHover.svg");
    public static Icon GearPlainHover = TintedIconsService.getAccentIcon("/iconsddlc/general/gearPlainHover.svg");
    public static Icon HideDownHover = TintedIconsService.getAccentIcon("/iconsddlc/general/hideDownHover.svg");
    public static Icon HideDownPartHover = TintedIconsService.getAccentIcon("/iconsddlc/general/hideDownPartHover.svg");
    public static Icon HideLeftHover = TintedIconsService.getAccentIcon("/iconsddlc/general/hideLeftHover.svg");
    public static Icon HideLeftPartHover = TintedIconsService.getAccentIcon("/iconsddlc/general/hideLeftPartHover.svg");
    public static Icon HideRightHover = TintedIconsService.getAccentIcon("/iconsddlc/general/hideRightHover.svg");
    public static Icon HideRightPartHover = TintedIconsService.getAccentIcon("/iconsddlc/general/hideRightPartHover.svg");
    public static Icon InlineEditHovered = TintedIconsService.getAccentIcon("/iconsddlc/general/inline_edit_hovered.svg");
    
    public static Icon InspectionsError = TintedIconsService.getAccentIcon("/iconsddlc/general/inspectionsError.svg");
    public static Icon LocateHover = TintedIconsService.getAccentIcon("/iconsddlc/general/locateHover.svg");
    public static Icon Modified = TintedIconsService.getAccentIcon("/iconsddlc/general/modified.svg");
    public static Icon OpenDiskHover = TintedIconsService.getAccentIcon("/iconsddlc/general/openDiskHover.svg");
    public static Icon ProjectConfigurable = TintedIconsService.getAccentIcon("/iconsddlc/general/projectConfigurable.svg");
    
  }
  
  public static class Ide {
    public static Icon Rating = TintedIconsService.getAccentIcon("/iconsddlc/ide/rating.svg");
    public static Icon Rating1 = TintedIconsService.getAccentIcon("/iconsddlc/ide/rating1.svg");
    public static Icon Rating2 = TintedIconsService.getAccentIcon("/iconsddlc/ide/rating2.svg");
    public static Icon Rating3 = TintedIconsService.getAccentIcon("/iconsddlc/ide/rating3.svg");
    public static Icon Rating4 = TintedIconsService.getAccentIcon("/iconsddlc/ide/rating4.svg");
  }
  
  public static class Arrows {
    public static Icon MaterialDownSelected = TintedIconsService.getAccentIcon("/iconsddlc/mac/material/down_selected.svg");
    public static Icon MaterialRightSelected = TintedIconsService.getAccentIcon("/iconsddlc/mac/material/right_selected.svg");
    public static Icon DarculaDownSelected = TintedIconsService.getAccentIcon("/iconsddlc/mac/darcula/down_selected.svg");
    public static Icon DarculaRightSelected = TintedIconsService.getAccentIcon("/iconsddlc/mac/darcula/right_selected.svg");
    public static Icon PlusSelected = TintedIconsService.getAccentIcon("/iconsddlc/mac/plusminus/plus_selected.svg");
    public static Icon MinusSelected = TintedIconsService.getAccentIcon("/iconsddlc/mac/plusminus/minus_selected.svg");
    
    public static Icon MaterialDown = TintedIconsService.getThemedIcon("/iconsddlc/mac/material/down.svg");
    public static Icon MaterialRight = TintedIconsService.getThemedIcon("/iconsddlc/mac/material/right.svg");
    public static Icon DarculaDown = TintedIconsService.getThemedIcon("/iconsddlc/mac/darcula/down.svg");
    public static Icon DarculaRight = TintedIconsService.getThemedIcon("/iconsddlc/mac/darcula/right.svg");
    public static Icon Plus = TintedIconsService.getThemedIcon("/iconsddlc/mac/plusminus/plus.svg");
    public static Icon Minus = TintedIconsService.getThemedIcon("/iconsddlc/mac/plusminus/minus.svg");
  }
  
  public static class Nodes {
    public static Icon TreeClosed = TintedIconsService.getThemedIcon("/iconsddlc/nodes/TreeClosed.svg");
    public static Icon FolderClosed = TintedIconsService.getThemedIcon("/iconsddlc/nodes/folderClosed.svg");
    public static Icon FolderOpen = TintedIconsService.getThemedIcon("/iconsddlc/nodes/folderOpen.svg");
  }
  
  public static class Nodes2 {
    public static Icon PinToolWindow = TintedIconsService.getAccentIcon("/iconsddlc/nodes/pinToolWindow.svg");
    public static Icon TabPin = TintedIconsService.getAccentIcon("/iconsddlc/nodes/tabPin.svg");
    
    public static Icon Folder = TintedIconsService.getThemedIcon("/iconsddlc/nodes/folder.svg");
    public static Icon FolderOpen = TintedIconsService.getThemedIcon("/iconsddlc/nodes/folderOpen.svg");
  }
  
  public static class Process {
    public static Icon Step1 = TintedIconsService.getAccentIcon("/iconsddlc/process/step_1.svg");
    public static Icon Step2 = TintedIconsService.getAccentIcon("/iconsddlc/process/step_2.svg");
    public static Icon Step3 = TintedIconsService.getAccentIcon("/iconsddlc/process/step_3.svg");
    public static Icon Step4 = TintedIconsService.getAccentIcon("/iconsddlc/process/step_4.svg");
    public static Icon Step5 = TintedIconsService.getAccentIcon("/iconsddlc/process/step_5.svg");
    public static Icon Step6 = TintedIconsService.getAccentIcon("/iconsddlc/process/step_6.svg");
    public static Icon Step7 = TintedIconsService.getAccentIcon("/iconsddlc/process/step_7.svg");
    public static Icon Step8 = TintedIconsService.getAccentIcon("/iconsddlc/process/step_8.svg");
    public static Icon Step9 = TintedIconsService.getAccentIcon("/iconsddlc/process/step_9.svg");
    public static Icon Step10 = TintedIconsService.getAccentIcon("/iconsddlc/process/step_10.svg");
    public static Icon Step11 = TintedIconsService.getAccentIcon("/iconsddlc/process/step_11.svg");
    public static Icon Step12 = TintedIconsService.getAccentIcon("/iconsddlc/process/step_12.svg");
    public static Icon StepMask = TintedIconsService.getAccentIcon("/iconsddlc/process/step_mask.svg");
    public static Icon StepPassive = TintedIconsService.getAccentIcon("/iconsddlc/process/step_passive.svg");
    
    public static Icon ProgressPauseHover = TintedIconsService.getAccentIcon("/iconsddlc/process/progressPauseHover.svg");
    public static Icon ProgressPauseSmallHover = TintedIconsService.getAccentIcon("/iconsddlc/process/progressPauseSmallHover.svg");
    public static Icon ProgressResumeHover = TintedIconsService.getAccentIcon("/iconsddlc/process/progressResumeHover.svg");
    public static Icon ProgressResumeSmallHover = TintedIconsService.getAccentIcon("/iconsddlc/process/progressResumeSmallHover.svg");
    public static Icon StopHover = TintedIconsService.getAccentIcon("/iconsddlc/process/stopHovered.svg");
    public static Icon StopSmallHover = TintedIconsService.getAccentIcon("/iconsddlc/process/stopSmallHovered.svg");
    
    public static Icon BigStep1 = TintedIconsService.getAccentIcon("/iconsddlc/process/big/step_1.svg");
    public static Icon BigStep2 = TintedIconsService.getAccentIcon("/iconsddlc/process/big/step_2.svg");
    public static Icon BigStep3 = TintedIconsService.getAccentIcon("/iconsddlc/process/big/step_3.svg");
    public static Icon BigStep4 = TintedIconsService.getAccentIcon("/iconsddlc/process/big/step_4.svg");
    public static Icon BigStep5 = TintedIconsService.getAccentIcon("/iconsddlc/process/big/step_5.svg");
    public static Icon BigStep6 = TintedIconsService.getAccentIcon("/iconsddlc/process/big/step_6.svg");
    public static Icon BigStep7 = TintedIconsService.getAccentIcon("/iconsddlc/process/big/step_7.svg");
    public static Icon BigStep8 = TintedIconsService.getAccentIcon("/iconsddlc/process/big/step_8.svg");
    public static Icon BigStep9 = TintedIconsService.getAccentIcon("/iconsddlc/process/big/step_9.svg");
    public static Icon BigStep10 = TintedIconsService.getAccentIcon("/iconsddlc/process/big/step_10.svg");
    public static Icon BigStep11 = TintedIconsService.getAccentIcon("/iconsddlc/process/big/step_11.svg");
    public static Icon BigStep12 = TintedIconsService.getAccentIcon("/iconsddlc/process/big/step_12.svg");
    public static Icon BigStepMask = TintedIconsService.getAccentIcon("/iconsddlc/process/big/step_mask.svg");
    public static Icon BigStepPassive = TintedIconsService.getAccentIcon("/iconsddlc/process/big/step_passive.svg");
  }
  
  public static class Windows {
    public static Icon CloseHover = TintedIconsService.getAccentIcon("/iconsddlc/windows/closeHover.svg");
  }
  
  public static class AppCode {
    public static Icon Group = TintedIconsService.getThemedIcon("/iconsddlc/plugins/appcode/Group.svg");
  }
  
  public static class DataGrip {
    public static Icon ConsoleRunHover = TintedIconsService.getAccentIcon("/iconsddlc/plugins/datagrip/consoleRunHover.svg");
    
    public static Icon ObjectGroup = TintedIconsService.getThemedIcon("/iconsddlc/plugins/datagrip/objectGroup.svg");
    public static Icon Table = TintedIconsService.getThemedIcon("/iconsddlc/plugins/datagrip/table.svg");
  }
  
}
