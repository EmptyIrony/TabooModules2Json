class Modules {

    /**
     * 基础模块：配置文件，任务链
     */
    @Des("基础模块：配置文件，任务链", "basic")
    val Basic = arrayOf(
        "basic-configuration",
        "basic-submit-chain",
    )

    /**
     * Bukkit 虚拟 OP 工具
     */
    @Des("Bukkit 虚拟 OP 工具", "bukkit")
    val BukkitFakeOp = arrayOf(
        "bukkit-fake-op",
        "bukkit-nms"
    )

    /**
     * Bukkit 与 Vault、PlaceholderAPI 等插件交互
     */
    @Des("Bukkit 与 Vault、PlaceholderAPI 等插件交互", "bukkit")
    val BukkitHook = arrayOf(
        "bukkit-hook",
    )

    /**
     * Bukkit 寻路工具
     */
    @Des("Bukkit 寻路工具", "bukkit")
    val BukkitNavigation = arrayOf(
        "bukkit-navigation",
        "bukkit-nms"
    )

    /**
     * Bukkit 箱子菜单
     */
    @Des("Bukkit 箱子菜单", "bukkit")
    val BukkitUI = arrayOf(
        "bukkit-ui",
        "bukkit-ui-12100",
        "bukkit-ui-legacy",
        "bukkit-util",
        "bukkit-xseries",
        "bukkit-xseries-item",
        "bukkit-nms",
        "minecraft-chat",
    )

    /**
     * Bukkit 扩展工具
     */
    @Des("Bukkit 扩展工具", "bukkit")
    val BukkitUtil = arrayOf(
        "bukkit-util",
        "bukkit-xseries",
        "minecraft-chat",
        "minecraft-i18n",
        "basic-configuration"
    )

    /**
     * XSeries
     */
    @Des("XSeries", "bukkit")
    val XSeries = arrayOf(
        "bukkit-xseries",
    )

    /**
     * XSeries（XSkull 及 ItemBuilder）
     */
    @Des("XSeries（XSkull 及 ItemBuilder）", "bukkit")
    val XSeriesItem = arrayOf(
        "bukkit-xseries",
        "bukkit-xseries-item",
    )

    /**
     * Bukkit NMS
     */
    @Des("Bukkit NMS", "bukkit")
    val BukkitNMS = arrayOf(
        "bukkit-nms",
    )

    /**
     * Bukkit NMS 扩展工具
     */
    @Des("Bukkit NMS 扩展工具", "bukkit")
    val BukkitNMSUtil = arrayOf(
        "bukkit-nms-legacy",
        "bukkit-nms-stable",
        "bukkit-nms-tag",
        "bukkit-nms-tag-12005",
        "bukkit-nms-tag-legacy",
        "bukkit-nms",
        *BukkitUtil,
    )

    /**
     * Bukkit NMS ItemTag 工具
     */
    @Des("Bukkit NMS ItemTag 工具", "bukkit")
    val BukkitNMSItemTag = arrayOf(
        "bukkit-nms-tag",
        "bukkit-nms-tag-12005",
        "bukkit-nms-tag-legacy",
        "bukkit-nms",
        "minecraft-chat",
    )

    /**
     * Bukkit NMS 数据序列化工具
     */
    @Des("Bukkit NMS 数据序列化工具", "bukkit")
    val BukkitNMSDataSerializer = arrayOf(
        "bukkit-nms-data-serializer",
        "bukkit-nms"
    )

    /**
     * Bukkit NMS 实体 AI
     */
    @Des("Bukkit NMS 实体 AI", "bukkit")
    val BukkitNMSEntityAI = arrayOf(
        "bukkit-nms-ai",
        "bukkit-nms"
    )

    /**
     * 数据库
     */
    @Des("数据库基础模块", "database")
    val Database = arrayOf(
        "database",
        "basic-configuration",
    )

    /**
     * Alkaid Redis
     */
    @Des("Alkaid Redis", "database")
    val DatabaseAlkaidRedis = arrayOf(
        "database-alkaid-redis",
        "basic-configuration",
    )

    /**
     * IOC
     */
    @Des("IOC", "database")
    val DatabaseIoc = arrayOf(
        "database-ioc",
        "basic-configuration",
    )

    /**
     * Lettuce Redis
     */
    @Des("Lettuce Redis", "database")
    val DatabaseLettuceRedis = arrayOf(
        "database-lettuce-redis",
        "basic-configuration",
    )

    /**
     * 玩家数据库
     */
    @Des("玩家数据库", "database")
    val DatabasePlayer = arrayOf(
        "database-player",
        *Database
    )

    /**
     * Persistent Container
     */
    @Des("Persistent Container", "database")
    val DatabasePtc = arrayOf(
        "database-ptc",
        *Database
    )

    /**
     * Persistent Container With Object
     */
    @Des("Persistent Container With Object", "database")
    val DatabasePtcObject = arrayOf(
        "database-ptc-object",
        *Database
    )

    /**
     * Minecraft 文本工具
     */
    @Des("Minecraft 文本工具", "minecraft")
    val MinecraftChat = arrayOf(
        "minecraft-chat",
    )

    /**
     * Minecraft 效果工具
     */
    @Des("Minecraft 效果工具", "minecraft")
    val MinecraftEffect = arrayOf(
        "minecraft-effect",
    )

    /**
     * 指令帮助
     */
    @Des("指令帮助", "minecraft")
    val CommandHelper = arrayOf(
        "minecraft-command-helper",
        "minecraft-chat",
        "minecraft-i18n",
    )

    /**
     * 国际化接口
     */
    @Des("国际化接口", "minecraft")
    val I18n = arrayOf(
        "minecraft-i18n",
        "minecraft-chat",
        "basic-configuration",
    )

    /**
     * Kether 脚本引擎
     */
    @Des("Kether 脚本引擎", "script")
    val Kether = arrayOf(
        "minecraft-kether",
        "minecraft-chat",
        "minecraft-i18n",
        "bukkit-nms",
        "bukkit-nms-stable",
        "basic-configuration",
    )

    /**
     * BStats 数据统计
     */
    @Des("BStats 数据统计", "minecraft")
    val Metrics = arrayOf(
        "minecraft-metrics",
        "basic-configuration",
    )

    /**
     * BungeeCord 通讯
     */
    @Des("BungeeCord 通讯", "minecraft")
    val Porticus = arrayOf(
        "minecraft-porticus",
        "basic-configuration",
    )

    /**
     * Javascript 脚本环境
     */
    @Des("Javascript 脚本环境", "script")
    val JavaScript = arrayOf("script-javascript")

    /**
     * Jexl 脚本环境
     */
    @Des("Jexl 脚本环境", "script")
    val Jexl = arrayOf("script-jexl")

    /**
     * Afybroker 平台
     */
    @Des("BungeeCord 平台", "platform")
    val AfyBroker = arrayOf("platform-afybroker")

    /**
     * 独立程序
     */
    @Des("独立程序", "platform")
    val App = arrayOf("platform-application")

    /**
     * Bukkit 平台
     */
    @Des("Bukkit 平台", "platform")
    val Bukkit = arrayOf("platform-bukkit", "platform-bukkit-impl")

    /**
     * BungeeCord 平台
     */
    @Des("BungeeCord 平台", "platform")
    val BungeeCord = arrayOf("platform-bungee", "platform-bungee-impl")

    /**
     * Velocity 平台
     */
    @Des("Velocity 平台", "platform")
    val Velocity = arrayOf("platform-velocity", "platform-velocity-impl")

}

@Target(AnnotationTarget.FIELD)
@Retention(AnnotationRetention.RUNTIME)
annotation class Des(val des: String, val category: String)