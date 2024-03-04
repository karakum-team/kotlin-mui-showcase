package team.karakum.showcase.material.data

import mui.material.Chip
import mui.material.ChipVariant.Companion.outlined
import react.FC
import react.Props
import react.ReactNode
import team.karakum.showcase.material.utils.ShowcaseContainer

val ChipShowcase = FC<Props> {
    ShowcaseContainer {
        Chip {
            label = ReactNode("Chip Filled")
        }
        Chip {
            label = ReactNode("Chip Outlined")
            variant = outlined
        }
    }
}
