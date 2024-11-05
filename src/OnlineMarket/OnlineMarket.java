package OnlineMarket;

import OnlineMarket.Attributes.Size;
import OnlineMarket.Employees.CEO;
import OnlineMarket.Enums.Category;
import OnlineMarket.Enums.Position;
import OnlineMarket.Info.*;
import OnlineMarket.Products.Book;
import OnlineMarket.Service.ProductService;

import java.time.LocalDate;
import java.util.List;

public class OnlineMarket {

    public static void main(String[] args) {
        AddressInfo ceoAddress = new AddressInfo("X", "XX", "XXX");
        EmployeeInfo ceoInfo = new EmployeeInfo(150000.0f, LocalDate.of(2015, 5, 20), Position.CEO);
        CEO ceo = new CEO(1, ceoInfo, ceoAddress);

        Book book1 = new Book.Builder(
                101,
                new ProductBasicInfo("Y", Category.BOOKS),
                new PricingInfo(45.99f, 1),
                new Size(15f, 22f, 3f),
                new ProductDetailsInfo("YY", true)
        )
                .author("YYY")
                .publisher("YYYY")
                .pageCount(412)
                .genre("YYYYY")
                .build();

        Book book2 = new Book.Builder(
                101,
                new ProductBasicInfo("Y", Category.BOOKS),
                new PricingInfo(45.99f, 2),
                new Size(15f, 22f, 3f),
                new ProductDetailsInfo("YY", true)
        )
                .author("YYY")
                .publisher("YYYY")
                .pageCount(412)
                .genre("YYYYY")
                .build();

        System.out.println("Total value " + ProductService.countTotalValue(List.of(book1, book2)));


        System.out.println("Book " + book1);
        System.out.println("CEO " + ceo);
    }

}
