package com.example.demo;
import java.util.function.Supplier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		test();
		SupplierImpl supplierImpl = new SupplierImpl();
		System.out.println(supplierImpl.get());
		System.out.println(supplierImpl.sasisuseso());

		// staticメソッド内で、DIによって生成されたstaticでないクラスを使うことはできない
		// のでインスタンス化する
		Definitions definitions = new Definitions();
		// definitions.hoge()は関数オブジェクトを返す
		System.out.println(definitions.hoge().get());
	}

	public static void test() {
		Supplier<String> supplier = () -> "あいうえお";
		// Supplierはインターフェースであるはずだが、supplierからは.get()が呼び出せる。
		// つまり、ラムダ式という関数型オブジェクトを関数型インターフェースにキャストして代入している
		System.out.println(supplier.get());
		System.out.println(supplier);
	}


}
