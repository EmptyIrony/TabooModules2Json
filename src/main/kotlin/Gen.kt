import com.google.gson.Gson
import com.google.gson.JsonObject

fun main() {
    val json = JsonObject()
    val modules = JsonObject()
    json.add("modules", modules)

    val map = HashMap<String, ArrayList<ModuleInfo>>()

    val ins = Modules()
    val clazz = Modules::class.java
    for (field in clazz.declaredFields) {
        val annotation = field.getAnnotation(Des::class.java) ?: continue
        field.isAccessible = true

        map.getOrPut(annotation.category) {
            ArrayList()
        } += ModuleInfo(
            field.name,
            annotation.des,
            field.name,
            field.get(ins) as Array<String>
        )
    }

    map.toList().sortedBy {
        sort.indexOf(it.first)
    }.forEach { (category, moduleList) ->
        modules.add(category, gson.toJsonTree(moduleList).asJsonArray)
    }

    println(json.toString())

}

val sort = listOf(
    "basic",
    "platform",
    "bukkit",
    "minecraft",
    "database",
    "script"
)

val gson = Gson()

data class ModuleInfo(
    val name: String,
    val desc: String,
    val id: String,
    val usedModules: Array<String>
)