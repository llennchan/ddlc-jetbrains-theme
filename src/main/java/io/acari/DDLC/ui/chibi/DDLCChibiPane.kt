package io.acari.DDLC.ui.chibi

import com.intellij.openapi.ui.AbstractPainter
import com.intellij.openapi.ui.Painter
import java.awt.Component
import java.awt.Graphics2D
import java.awt.Image
import java.awt.Insets
import java.util.stream.Collectors
import javax.swing.JComponent
import javax.swing.JFrame
import javax.swing.JPanel
import javax.swing.SwingUtilities

/**
 * Forged in the flames of battle by alex.
 */
class DDLCChibiPane(private val rootPane: JFrame) : JPanel() {
    companion object {
        val EDITOR = "EDITOR"
        val EMPTY_FRAME = "EMPTY_FRAME"
    }

    private lateinit var namedPainters: Map<String, DDLCPaintersManager>

    init {
        isOpaque = false
        isVisible = false
        layout = null
        namedPainters = listOf(EDITOR, EMPTY_FRAME)
                .stream()
                .collect(Collectors.toMap({ paneKey ->
                    paneKey
                }, { DDLCPaintersManager(this) }))

        DDLCChibiPainters.initEditorPainters(this)
        DDLCChibiPainters.initFramePainters(this)
    }
}

object DDLCChibiPainters {
    fun initFramePainters(ddlcChibiPane: DDLCChibiPane) {

    }

    fun initEditorPainters(ddlcChibiPane: DDLCChibiPane) {
        ImagePainter()
    }
}

class DDLCPaintersManager(private val rootComponent: JComponent) : Painter.Listener {

    override fun onNeedsRepaint(painter: Painter?, dirtyComponent: JComponent?) =
            if (dirtyComponent != null && dirtyComponent.isShowing) {
                val rec = SwingUtilities.convertRectangle(dirtyComponent, dirtyComponent.bounds, myRootComponent)
                rootComponent.repaint(rec)
            } else {
                rootComponent.repaint()
            }

}

class ImagePainter(private val image: Image? = null,
                   private val insets: Insets? = null) : AbstractPainter() {
    override fun executePaint(component: Component, g: Graphics2D) {
//        paintThatShit(component, g, image, insets)
    }

    fun paintThatShit(component: Component,
                      graphics2D: Graphics2D,
                      image: Image,
                      insets: Insets) {

    }
}