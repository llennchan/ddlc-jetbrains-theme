package io.acari.doki.settings.actors

import io.acari.doki.config.ThemeConfig

object ThemeStatusBarActor {
  fun applyConfig(showThemeStatusBar: Boolean) {
    if(ThemeConfig.instance.showThemeStatusBar != showThemeStatusBar) {
      ThemeConfig.instance.showThemeStatusBar = showThemeStatusBar
    }
  }
}