package lec16.ex2;

public class ItemWithTaxImpl implements ItemWithTax {

	private Item original_item;
	private double tax_rate;
	
	public ItemWithTaxImpl(Item item, double rate) {
		original_item = item;
		tax_rate = rate;
	}

	@Override
	public double getTaxRate() {
		return tax_rate;
	}

	@Override
	public Item getItem() {
		return original_item;
	}
	
	
}
