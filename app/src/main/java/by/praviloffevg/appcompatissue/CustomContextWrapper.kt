package by.praviloffevg.appcompatissue

import android.content.Context
import android.content.ContextWrapper
import android.content.res.Resources

class CustomContextWrapper private constructor(
    base: Context
): ContextWrapper(base){

    override fun getResources(): Resources  = CustomResources(super.getResources())

    class CustomResources(resources: Resources): ResourcesWrapper(resources)

    companion object {
        @JvmStatic
        fun wrap(base: Context): CustomContextWrapper = CustomContextWrapper(base)
    }
}