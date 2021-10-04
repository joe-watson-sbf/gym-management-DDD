package co.com.sofka.gymmanagement.usecase.salesmanager;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.gymmanagement.domain.fitnessgym.value.FitnessGymId;
import co.com.sofka.gymmanagement.domain.fitnessgym.value.SalesmanId;
import co.com.sofka.gymmanagement.domain.salesmanager.command.CreateSalesManager;
import co.com.sofka.gymmanagement.domain.salesmanager.value.SalesManagerId;
import co.com.sofka.gymmanagement.usecase.fitnessgym.CreateSalesmanUseCase;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class CreateSalesManagerTest {

    @Test
    void create(){
        var command = new CreateSalesManager(
                new FitnessGymId("WRE-4656"),
                new SalesManagerId("POOIU899"),
                new SalesmanId("VBN97Q")
        );

        var usecase = new CreateSalesmanUseCase();



    }

}