package alviano.kotlin.restful.service

import alviano.kotlin.restful.model.CreateProductRequest
import alviano.kotlin.restful.model.ProductResponse

interface ProductService {

    fun create(createProductRequest: CreateProductRequest): ProductResponse

    fun get(id: String): ProductResponse
}