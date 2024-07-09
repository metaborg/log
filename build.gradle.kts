// Workaround for issue: https://youtrack.jetbrains.com/issue/KTIJ-19369
@Suppress("DSL_SCOPE_VIOLATION")
plugins {
    alias(libs.plugins.metaborg.convention.rootproject)
    alias(libs.plugins.gitonium)
}
