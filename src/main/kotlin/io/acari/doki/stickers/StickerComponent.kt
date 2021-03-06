package io.acari.doki.stickers

import com.intellij.ide.ui.LafManagerListener
import com.intellij.ide.ui.laf.LafManagerImpl
import com.intellij.openapi.Disposable
import com.intellij.openapi.application.ApplicationManager
import io.acari.doki.themes.ThemeManager
import javax.swing.UIManager

class StickerComponent: Disposable {
    private val connection = ApplicationManager.getApplication().messageBus.connect()

    init {
        processLaf(LafManagerImpl.getInstance().currentLookAndFeel)
        connection.subscribe(LafManagerListener.TOPIC, LafManagerListener {
            processLaf(it.currentLookAndFeel)
        }) 
    }

    private fun processLaf(currentLaf: UIManager.LookAndFeelInfo?) {
        ThemeManager.instance.processLaf(currentLaf)
            .ifPresentOrElse({
                StickerService.instance.activateForTheme(it)
            }) {
                StickerService.instance.remove()
            }
    }

    override fun dispose() {
        connection.dispose()
    }
}