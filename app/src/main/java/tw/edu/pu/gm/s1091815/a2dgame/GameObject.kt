package tw.edu.pu.gm.s1091815.a2dgame

import android.graphics.Canvas

interface GameObject {
    fun draw(canvas: Canvas)
    fun update()
}