package com.github.codew1997.onboarding.sdk.models

import androidx.annotation.DrawableRes

interface OnboardingModel {
    @get:DrawableRes
    val image: Int
    val title: String
    val description: String
}