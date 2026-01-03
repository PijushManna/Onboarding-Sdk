package com.github.codew1997.onboarding.sdk.components

import androidx.compose.runtime.Composable
import com.github.codew1997.onboarding.sdk.models.OnboardingModel
import com.github.codew1997.onboarding.sdk.utils.OnboardingUtils

@Composable
fun ContentWithOnboardingScreen(onboardingUtils: OnboardingUtils, pages: List<OnboardingModel>, onFinished:() -> Unit) {
    if (!onboardingUtils.isOnboardingCompleted()) {
        OnboardingScreen(pages = pages){
            onboardingUtils.setOnboardingCompleted()
            onFinished()
        }
    }else{
        onFinished()
    }
}