
public class Product {

	private long Id;
	private String ProductName;
	private String SupplierName;
	
	public long getId() {
		return Id;
	}
	
	public String getProductName() {
		return ProductName;
	}
	
	public String getSupplierName() {
		return SupplierName;
	}
	public void setId(long id) {
		this.Id=id;
	}

	public void setProductName(String ProductName) {
		this.ProductName = ProductName;
	}

	public void setSupplierName(String SupplierName) {
		this.SupplierName = SupplierName;
	}

}
