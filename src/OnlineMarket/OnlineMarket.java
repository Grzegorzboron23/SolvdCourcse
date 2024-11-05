package OnlineMarket;

import OnlineMarket.Attributes.Size;
import OnlineMarket.Employees.CEO;
import OnlineMarket.Enums.Category;
import OnlineMarket.Enums.Position;
import OnlineMarket.Info.*;
import OnlineMarket.Products.Book;

import java.time.LocalDate;

public class OnlineMarket {

        public static void main(String[] args) {
            AddressInfo ceoAddress = new AddressInfo("X", "XX", "XXX");
            EmployeeInfo ceoInfo = new EmployeeInfo(150000.0f, LocalDate.of(2015, 5, 20), Position.CEO);
            CEO ceo = new CEO(1, ceoInfo, ceoAddress);

            Book book = new Book.Builder(
                    101,
                    new ProductBasicInfo("Y", Category.BOOKS),
                    new PricingInfo(45.99f, 150),
                    new Size(15f, 22f, 3f),
                    new ProductDetailsInfo("YY", true)
            )
                    .author("YYY")
                    .publisher("YYYY")
                    .pageCount(412)
                    .genre("YYYYY")
                    .build();

            System.out.println("Book " + book);
            System.out.println("CEO " + ceo);
        }

}
