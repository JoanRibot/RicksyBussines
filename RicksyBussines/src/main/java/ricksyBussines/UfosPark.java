package ricksyBussines;


import java.util.HashMap;
import java.util.Map;

public class UfosPark implements GuestDispatcher{
	final double fee = 500d;
    private final Map<String,String> flota = new HashMap<>();


    public void add(String ovniID){
        this.flota.putIfAbsent(ovniID, null);
    }

	@Override
	public void dispatch(CreditCard card) {
		
		if(!this.flota.containsValue(card.number())){
			for(Map.Entry<String,String> entrada: this.flota.entrySet()){
				if(entrada.getValue() == null){
					if(card.pay(this.fee)){
					this.flota.put(entrada.getKey(), card.number());
					break;
					}
				}
			}
		}
		
	}

	public String getUfoOf(String number) {
        if (this.flota.containsValue(number)) {
            for (Map.Entry<String, String> entry: this.flota.entrySet()) {
                if (entry.getValue() == number) {
                    return entry.getKey();
                }
            }
		}
		return null;
	}

	boolean containsCard(String number) {
        return this.flota.containsValue(number);
    }
}