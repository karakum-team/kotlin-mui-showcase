package team.karakum.showcase.material.feedback

import mui.material.Skeleton
import mui.material.SkeletonVariant.Companion.circular
import mui.material.SkeletonVariant.Companion.rectangular
import mui.material.SkeletonVariant.Companion.text
import mui.system.sx
import react.FC
import react.Props
import web.cssom.px

val SkeletonShowcase = FC<Props> {
    Skeleton {
        variant = text
        width = 210
    }
    Skeleton {
        variant = circular
        width = 40
        height = 40

        sx {
            marginBottom = 4.px
        }
    }
    Skeleton {
        variant = rectangular
        width = 210
        height = 118
    }
}
