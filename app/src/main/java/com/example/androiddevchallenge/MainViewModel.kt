/*
 * Copyright 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.androiddevchallenge

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.example.androiddevchallenge.ui.data.Animal

class MainViewModel : ViewModel() {
    var mainDefaultListData by mutableStateOf(
        mutableListOf(
            Animal(R.mipmap.animal_01, "球球", "猫咪找领养 已绝育 疫苗已打 胆小安静"),
            Animal(R.mipmap.animal_02, "黑炭", "可爱宝贝找领养 已绝育 疫苗已打 性格活泼"),
            Animal(R.mipmap.animal_03, "小黄", "小奶狗找领养 未绝育 疫苗已打 性格温顺"),
            Animal(R.mipmap.animal_04, "铁蛋", "二哈找领养 未绝育 疫苗已打 调皮可爱"),
            Animal(R.mipmap.animal_05, "可乐", "拉布拉多找领养 未绝育 疫苗已打 温顺可爱"),
            Animal(R.mipmap.animal_01, "球球", "猫咪找领养 已绝育 疫苗已打 胆小安静"),
            Animal(R.mipmap.animal_02, "黑炭", "可爱宝贝找领养 已绝育 疫苗已打 性格活泼"),
            Animal(R.mipmap.animal_03, "小黄", "小奶狗找领养 未绝育 疫苗已打 性格温顺"),
            Animal(R.mipmap.animal_04, "铁蛋", "二哈找领养 未绝育 疫苗已打 调皮可爱"),
            Animal(R.mipmap.animal_05, "可乐", "拉布拉多找领养 未绝育 疫苗已打 温顺可爱"),
            Animal(R.mipmap.animal_01, "球球", "猫咪找领养 已绝育 疫苗已打 胆小安静"),
            Animal(R.mipmap.animal_02, "黑炭", "可爱宝贝找领养 已绝育 疫苗已打 性格活泼"),
            Animal(R.mipmap.animal_03, "小黄", "小奶狗找领养 未绝育 疫苗已打 性格温顺"),
            Animal(R.mipmap.animal_04, "铁蛋", "二哈找领养 未绝育 疫苗已打 调皮可爱"),
            Animal(R.mipmap.animal_05, "可乐", "拉布拉多找领养 未绝育 疫苗已打 温顺可爱")
        )
    )
}
