/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2017 Chris Magnussen and Elior Boukhobza
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

package com.chrisrm.idea.actions.themes.literature.club;

import com.chrisrm.idea.MTConfig;
import com.chrisrm.idea.MTThemeManager;
import com.chrisrm.idea.MTThemes;
import com.chrisrm.idea.actions.ClubMemberManager;
import com.chrisrm.idea.actions.accents.MTFuschiaAccentAction;
import com.chrisrm.idea.actions.themes.MTAbstractThemeAction;
import com.intellij.openapi.actionSystem.AnActionEvent;

public final class MTNatsukiThemeAction extends MTAbstractThemeAction {
  private final MTFuschiaAccentAction mtFuschiaAccentAction = new MTFuschiaAccentAction();
  @Override
  public boolean isSelected(final AnActionEvent e) {
    return MTConfig.getInstance().getSelectedTheme() == MTThemes.NATSUKI;
  }

  @Override
  public void setSelected(final AnActionEvent e, final boolean state) {
    super.setSelected(e, state);
  }

  public void selectionActivation() {
    super.selectionActivation();
    mtFuschiaAccentAction.setAccentToTheme();
    MTThemeManager.getInstance().activate(MTThemes.NATSUKI, true);
    ClubMemberManager.getInstance().activate(MTThemes.NATSUKI);
  }


  @Override
  protected MTThemes getTheme() {
    return MTThemes.NATSUKI;
  }
}
