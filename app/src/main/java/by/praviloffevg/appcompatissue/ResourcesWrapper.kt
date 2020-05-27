package by.praviloffevg.appcompatissue

import android.content.res.Resources

open class ResourcesWrapper(resources: Resources) : Resources(resources.assets, resources.displayMetrics, resources.configuration) {

    override fun getString(id: Int): String {
        return "Hello world from wrapper"
    }
}