package alviano.kotlin.restful.service

import alviano.kotlin.restful.model.CreateProductRequest
import alviano.kotlin.restful.model.ProductResponse
import alviano.kotlin.restful.model.UpdateProductRequest

interface ProductService {

    fun create(createProductRequest: CreateProductRequest): ProductResponse

    fun get(id: String): ProductResponse

    fun update(id: String, updateProductRequest: UpdateProductRequest): ProductResponse
}