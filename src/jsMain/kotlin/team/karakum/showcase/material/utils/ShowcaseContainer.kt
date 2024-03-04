package team.karakum.showcase.material.utils

import mui.material.Box
import mui.system.BoxOwnProps
import mui.system.sx
import react.FC
import team.karakum.autoComplete
import team.karakum.noValidate
import web.cssom.Display
import web.cssom.JustifyContent
import web.cssom.px

external interface ShowcaseContainerProps : BoxOwnProps

val ShowcaseContainer = FC<ShowcaseContainerProps> { props ->
    Box {
        noValidate = true
        autoComplete = "off"
        +props

        sx {
            display = Display.flex
            justifyContent = JustifyContent.left
            gap = 8.px
            +props.sx
        }
    }
}
