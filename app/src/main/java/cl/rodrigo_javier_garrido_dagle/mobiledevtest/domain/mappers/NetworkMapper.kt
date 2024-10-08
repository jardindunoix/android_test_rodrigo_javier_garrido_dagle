package cl.rodrigo_javier_garrido_dagle.mobiledevtest.domain.mappers

import cl.rodrigo_javier_garrido_dagle.mobiledevtest.data.network.dto.HitDto
import cl.rodrigo_javier_garrido_dagle.mobiledevtest.domain.model.HighlightResult
import cl.rodrigo_javier_garrido_dagle.mobiledevtest.domain.model.Hit

fun HitDto.networkToDomain() = Hit(
   highlightResult = highlightResult as HighlightResult,
   tags = tags,
   author = author,
   commentText = commentText,
   createdAt = createdAt,
   createdAtI = createdAtI,
   objectID = objectID,
   parentId = parentId,
   storyId = storyId,
   storyTitle = storyTitle,
   storyUrl = storyUrl,
   updatedAt = updatedAt,
)