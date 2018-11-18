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
 */

package com.chrisrm.ideaddlc.icons.tinted;

import com.chrisrm.ideaddlc.MTConfig;
import com.intellij.icons.AllIcons;
import com.intellij.openapi.components.ServiceManager;
import com.intellij.openapi.util.IconLoader;
import com.intellij.ui.ColorUtil;
import io.acari.DDLC.DDLCConfig;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;
import javax.swing.plaf.*;
import java.awt.*;
import java.util.Arrays;
import java.util.List;

public final class TintedIconsService {
  
  public static final String[] TINTED_ICONS = new String[]{
      "/iconsdddlc/ddlc/actions/closeHovered.svg",
      "/iconsdddlc/ddlc/actions/closeNewHovered.svg",
      "/iconsdddlc/general/expandAllHover.svg",
      "/iconsdddlc/general/expandComponentHover.svg",
      "/iconsdddlc/general/collapseAllHover.svg",
      "/iconsdddlc/general/collapseComponentHover.svg",
      "/iconsdddlc/general/copyHovered.svg",
      "/iconsdddlc/general/gearHover.svg",
      "/iconsdddlc/general/gearPlainHover.svg",
      "/iconsdddlc/general/hideDownHover.svg",
      "/iconsdddlc/general/hideDownPartHover.svg",
      "/iconsdddlc/general/hideLeftHover.svg",
      "/iconsdddlc/general/hideLeftPartHover.svg",
      "/iconsdddlc/general/hideRightHover.svg",
      "/iconsdddlc/general/hideRightPartHover.svg",
      "/iconsdddlc/general/inline_edit_hovered.svg",
      "/iconsdddlc/general/inspectionsError.svg",
      "/iconsdddlc/general/locateHover.svg",
      "/iconsdddlc/general/modified.svg",
      "/iconsdddlc/general/openDiskHover.svg",
      "/iconsdddlc/general/projectConfigurable.svg",
      "/iconsdddlc/ddlc/ide/rating.svg",
      "/iconsdddlc/ddlc/ide/rating1.svg",
      "/iconsdddlc/ddlc/ide/rating2.svg",
      "/iconsdddlc/ddlc/ide/rating3.svg",
      "/iconsdddlc/ddlc/ide/rating4.svg",
      "/iconsdddlc/mac/tree_white_down_arrow_selected.svg",
      "/iconsdddlc/mac/tree_white_right_arrow_selected.svg",
      "/iconsdddlc/mac/material/down_selected.svg",
      "/iconsdddlc/mac/material/right_selected.svg",
      "/iconsdddlc/mac/darcula/down_selected.svg",
      "/iconsdddlc/mac/darcula/right_selected.svg",
      "/iconsdddlc/mac/plusminus/plus_selected.svg",
      "/iconsdddlc/mac/plusminus/minus_selected.svg",
      "/iconsdddlc/nodes/pinToolWindow.svg",
      "/iconsdddlc/nodes/tabPin.svg",
      "/iconsdddlc/ddlc/process/step_1.svg",
      "/iconsdddlc/ddlc/process/step_2.svg",
      "/iconsdddlc/ddlc/process/step_3.svg",
      "/iconsdddlc/ddlc/process/step_4.svg",
      "/iconsdddlc/ddlc/process/step_5.svg",
      "/iconsdddlc/ddlc/process/step_6.svg",
      "/iconsdddlc/ddlc/process/step_7.svg",
      "/iconsdddlc/ddlc/process/step_8.svg",
      "/iconsdddlc/ddlc/process/step_9.svg",
      "/iconsdddlc/ddlc/process/step_10.svg",
      "/iconsdddlc/ddlc/process/step_11.svg",
      "/iconsdddlc/ddlc/process/step_12.svg",
      "/iconsdddlc/ddlc/process/big/step_1.svg",
      "/iconsdddlc/ddlc/process/big/step_2.svg",
      "/iconsdddlc/ddlc/process/big/step_3.svg",
      "/iconsdddlc/ddlc/process/big/step_4.svg",
      "/iconsdddlc/ddlc/process/big/step_5.svg",
      "/iconsdddlc/ddlc/process/big/step_6.svg",
      "/iconsdddlc/ddlc/process/big/step_7.svg",
      "/iconsdddlc/ddlc/process/big/step_8.svg",
      "/iconsdddlc/ddlc/process/big/step_9.svg",
      "/iconsdddlc/ddlc/process/big/step_10.svg",
      "/iconsdddlc/ddlc/process/big/step_11.svg",
      "/iconsdddlc/ddlc/process/big/step_12.svg",
      "/iconsdddlc/ddlc/process/step_mask.svg",
      "/iconsdddlc/ddlc/process/big/step_mask.svg",
      "/iconsdddlc/ddlc/process/step_passive.svg",
      "/iconsdddlc/ddlc/process/big/step_passive.svg",
      "/iconsdddlc/process/progressPauseHover.svg",
      "/iconsdddlc/process/progressPauseSmallHover.svg",
      "/iconsdddlc/process/progressResumeHover.svg",
      "/iconsdddlc/process/progressResumeSmallHover.svg",
      "/iconsdddlc/process/stopHovered.svg",
      "/iconsdddlc/process/stopSmallHovered.svg",
      "/iconsdddlc/windows/closeHover.svg",
      "/iconsdddlc/plugins/datagrip/consoleRunHover.svg",
  };
  private static final List<String> MY_TINTED_ICONS = Arrays.asList(TintedIconsService.TINTED_ICONS);
  
  public static final String[] THEMED_ICONS = {
      "/iconsdddlc/nodes/folder.svg",
      "/iconsdddlc/nodes/TreeClosed.svg",
      "/iconsdddlc/nodes/folderClosed.svg",
      "/iconsdddlc/nodes/folderOpen.svg",
      "/iconsdddlc/mac/tree_white_down_arrow.svg",
      "/iconsdddlc/mac/tree_white_right_arrow.svg",
      "/iconsdddlc/mac/material/down.svg",
      "/iconsdddlc/mac/material/right.svg",
      "/iconsdddlc/mac/darcula/down.svg",
      "/iconsdddlc/mac/darcula/right.svg",
      "/iconsdddlc/mac/plusminus/plus.svg",
      "/iconsdddlc/mac/plusminus/minus.svg",
      "/iconsdddlc/plugins/appcode/Group.svg",
      "/iconsdddlc/plugins/datagrip/objectGroup.svg",
      "/iconsdddlc/plugins/datagrip/table.svg"
  };
  private static final List<String> MY_THEMED_ICONS = Arrays.asList(THEMED_ICONS);
  
  public static TintedIconsService getInstance() {
    return ServiceManager.getService(TintedIconsService.class);
  }
  
  private TintedIconsService() {
  }
  
  @NotNull
  public static Icon getIcon(final String newPath) {
    return getIcon(newPath, MTConfig.getInstance().getAccentColor());
  }
  
  @NotNull
  public static Icon getIcon(final String newPath, final String accentColor) {
    if (newPath == null) {
      return IconLoader.getTransparentIcon(AllIcons.FileTypes.Any_type, 0);
    } else if (MY_TINTED_ICONS.contains(newPath)) {
      return new TintedIcon(IconLoader.getIcon(newPath), ColorUtil.fromHex(accentColor), newPath);
    } else if (MY_THEMED_ICONS.contains(newPath)) {
      final Color folderColor = DDLCConfig.getInstance().getSelectedTheme().getTheme().getPrimaryColor();
      return new TintedIcon(IconLoader.getIcon(newPath), folderColor, newPath);
    }
    return IconLoader.getIcon(newPath);
  }
  
  @NotNull
  public static Icon getAccentIcon(@NotNull final String newPath) {
    final String accentColor = MTConfig.getInstance().getAccentColor();
    return new TintedIcon(IconLoader.getIcon(newPath), ColorUtil.fromHex(accentColor), newPath);
  }
  
  @NotNull
  public static Icon getThemedIcon(@NotNull final String newPath) {
    Color folderColor = DDLCConfig.getInstance().getSelectedTheme().getTheme().getPrimaryColor();
    if (!MTConfig.getInstance().isMaterialTheme()) {
      folderColor = new ColorUIResource(0xA1ACB3);
    }

    return new TintedIcon(IconLoader.getIcon(newPath), folderColor, newPath);
  }
  
  @NotNull
  public static Icon getTintedIcon(@NotNull final String newPath, final Color color) {
    return new TintedIcon(IconLoader.getIcon(newPath), color, newPath);
  }
  
  @NotNull
  public static Icon getTintedIcon(@NotNull final String newPath, final String color) {
    return new TintedIcon(IconLoader.getIcon(newPath), ColorUtil.fromHex(color), newPath);
  }
  
  @NotNull
  public static Icon getTransparentIcon() {
    return IconLoader.getTransparentIcon(AllIcons.FileTypes.Any_type, 0);
  }
}
