package gabor.koleszar.beerinfo.data.mappers

import gabor.koleszar.beerinfo.data.local.BeerEntity
import gabor.koleszar.beerinfo.data.remote.BeerDto
import gabor.koleszar.beerinfo.domain.Beer

fun BeerDto.toBeerEntity(): BeerEntity {
    return BeerEntity(
        id = id,
        name = name,
        tagline = tagline,
        description = description,
        firstBrewed = first_brewed,
        imageUrl = image_url
    )
}

fun BeerEntity.toBeer(): Beer {
    return Beer(
        id = id,
        name = name,
        tagline = tagline,
        description = description,
        firstBrewed = firstBrewed,
        imageUrl = imageUrl
    )
}