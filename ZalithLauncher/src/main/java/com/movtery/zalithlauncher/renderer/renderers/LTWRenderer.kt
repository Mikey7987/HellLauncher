package com.movtery.zalithlauncher.renderer.renderers

import com.movtery.zalithlauncher.renderer.RendererInterface

/**
 * Large Thin Wrapper: OpenGL 3.x compatibility layer backed by GLES 3.
 * The native library is supplied by the CI build from the upstream LTW project.
 */
class LTWRenderer : RendererInterface {
    override fun getRendererId(): String = "opengles3_ltw"

    override fun getUniqueIdentifier(): String = "c1c47f80-2e45-4d13-9f79-7f1d3b4e7a61"

    override fun getRendererName(): String = "LTW (OpenGL 3)"

    override fun getRendererEnv(): Lazy<Map<String, String>> = lazy {
        mapOf("LIBGL_ES" to "3")
    }

    override fun getDlopenLibrary(): Lazy<List<String>> = lazy { emptyList() }

    override fun getRendererLibrary(): String = "libltw.so"

    override fun getRendererEGL(): String = "libltw.so"
}
