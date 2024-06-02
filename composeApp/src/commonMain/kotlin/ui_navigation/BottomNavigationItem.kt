package  ui_navigation

import easy_keep.composeapp.generated.resources.Res
import easy_keep.composeapp.generated.resources.ic_add
import easy_keep.composeapp.generated.resources.ic_home
import easy_keep.composeapp.generated.resources.ic_profile
import org.jetbrains.compose.resources.DrawableResource
import org.jetbrains.compose.resources.ExperimentalResourceApi

@OptIn(ExperimentalResourceApi::class)
sealed class BottomNavigationItem(val title: String, val icon: DrawableResource, val route: String) {
    data object Home : BottomNavigationItem("Home", Res.drawable.ic_home, "home")
    data object Add :
        BottomNavigationItem("Add", Res.drawable.ic_add, "add")

    data object Profile : BottomNavigationItem(
        "Profile",
        Res.drawable.ic_profile,
        "profile"
    )
}