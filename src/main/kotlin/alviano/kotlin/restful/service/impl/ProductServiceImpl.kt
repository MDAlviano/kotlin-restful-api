package alviano.kotlin.restful.service.impl

import alviano.kotlin.restful.entity.Product
import alviano.kotlin.restful.model.CreateProductRequest
import alviano.kotlin.restful.model.ProductResponse
import alviano.kotlin.restful.repository.ProductRepository
import alviano.kotlin.restful.service.ProductService
import org.springframework.stereotype.Service
import java.util.*

@Service
class ProductServiceImpl(val productRepository: ProductRepository) : ProductService {
    override fun create(createProductRequest: CreateProductRequest): ProductResponse {

        val product = Product(
            id = createProductRequest.id,
            name = createProductRequest.name,
            price = createProductRequest.price,
            quantity = createProductRequest.quantity,
            createdAt = Date(),
            updatedAt = null
        )

        productRepository.save(product)

        return ProductResponse(
            id = product.id,
            name = product.name,
            price = product.price,
            quantity = product.quantity,
            createdAt = product.createdAt,
            updatedAt = product.updatedAt
        )

    }
}