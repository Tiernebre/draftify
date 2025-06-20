package app.draftify.web.service

import app.draftify.web.model.Account
import app.draftify.web.repository.AccountRepository
import org.springframework.stereotype.Service
import kotlin.jvm.optionals.getOrNull

@Service
class AccountService(val repository: AccountRepository) {
    fun get(): Account? {
        return repository.findById(1L).getOrNull()
    }
}