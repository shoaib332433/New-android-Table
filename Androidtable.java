import javax.swing.text.View;

public class Androidtable{

    TextView resulttable=findViewbyId(R.id.reult);
    TextView txtenter=findViewbyId(R.id.txte);


    public void Main(String[] arr){
        Button btn=findViewbyId(R.Id.btn);



        btn.setOnclickListner(New View.OnclikListner{

            @Override
            public void onClick(View view){

                String text="";

                for(int i=1;i<=10;i++){
                    text=text+txtenter+"X"+i+"="+(txtenter*i)+"\n";
                    resulttable.setText(text);
                }

            }
        });

    }




}