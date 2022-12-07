package tr.edu.medipol.yova.OgrenciWebServisi;

import java.util.*;

import org.springframework.web.bind.annotation.*;


//localhost:8080/ogrenci/listele

@RestController  // Rest web servis sınıfı özelliği kazandırıyoruz
@RequestMapping("/ogrenci") // "/ogrenci ile baslayan wb isteklerini bu sınıfa yönlendirir"
public class OgrenciRestApi {

	
  private static final List<String> OGRENCILER = new ArrayList<>();
  {
	OGRENCILER.add("Jane");
	OGRENCILER.add("Joe");
  }
	
  
  
  @GetMapping("/listele")
  public List<String> listele(){
	  return OGRENCILER;
	  	  
  }
  
  
  
  
}




