import csstype.Color
import csstype.TextDecoration
import kotlinext.js.jso
import mui.material.*
import mui.system.Box
import react.FC
import react.Props
import react.ReactNode
import react.css.css
import react.dom.html.ReactHTML.nav
import react.router.dom.NavLink
import react.router.useLocation
import react.router.useResolvedPath

external interface SidebarProps : Props {
    var value: Iterable<ShowcaseInfo>
}

val Sidebar = FC<SidebarProps> { props ->
    val routeKey = useLocation().pathname.removePrefix("/")
    console.log("routeKey", routeKey)
    console.log("routeKey", useResolvedPath("alert"))

    Box {
        component = nav

        Drawer {
            sx = jso {
                width = Sizes.Sidebar.Width
                variant = "permanent"
                anchor = "left"
                open = true
            }

            List {
                props.value.map { (key, name) ->
                    NavLink {
                        to = key

                        css {
                            textDecoration = TextDecoration.none
                            color = Color.currentcolor
                        }

                        ListItemButton {
                            // TODO: Needs an ability to set generic type to `ListItemButton` component [MUI]
                            this as ListItemButtonBaseProps

                            selected = routeKey == key

                            ListItemText {
                                primary = ReactNode(name)
                            }
                        }
                    }
                }
            }
        }
    }
}
