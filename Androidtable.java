import javax.swing.text.View;

public class Androidtable{

    TextView resulttable=findViewbyId(R.id.reult);
    TextView txtenter=findViewbyId(R.id.txte);


    public void Main(String[] arr){
        Button btn=findViewbyId(R.Id.btn);


        btn.setOnclickListner(New View.OnclikListner{

            @Override
            public void onClick(View view){
                
                for(int i=1;i<=10;i++){

                }

            }
        });

    }




}