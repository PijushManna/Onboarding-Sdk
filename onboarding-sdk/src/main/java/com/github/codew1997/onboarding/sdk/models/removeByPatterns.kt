package com.github.codew1997.onboarding.sdk.models

fun removeByPatterns(
    markdown: String,
    patterns: List<Regex>
): String {
    var result = markdown

    patterns.forEach { regex ->
        result = result.replace(regex, "")
    }

    return result.trim()
}
