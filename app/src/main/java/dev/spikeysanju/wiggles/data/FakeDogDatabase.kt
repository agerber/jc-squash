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
package dev.spikeysanju.wiggles.data

import dev.spikeysanju.wiggles.R
import dev.spikeysanju.wiggles.model.Player
import dev.spikeysanju.wiggles.model.Owner
//https://www.psaworldtour.com/view-player/player/amanda-sobhy/
object FakeDogDatabase {
    val owner = Owner("Spikey Sanju", "Developer & Pet Lover", R.drawable.owner)
    val playerLists = listOf(
        Player(
            0,
            1,
            "Ali Farag",
            31,
            "Men",
            "Brown",
            12.9,
            "389m away",
            R.drawable.ali,
            "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries,",
            owner
        ),
        Player(
            1,
            1,
            "Nouran Gohar",
            25,
            "Women",
            "Gold",
            12.4,
            "412m away",
            R.drawable.nouran,
            "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries,",
            owner
        )

    )
}
