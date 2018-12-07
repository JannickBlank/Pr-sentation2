
package info.christmann.recs3.tor_master.webinterface.views;
import org.vaadin.alump.fancylayouts.FancyCssLayout;

import com.vaadin.ui.AbsoluteLayout;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Label;
import com.vaadin.ui.TextArea;
import com.vaadin.ui.TextField;
import com.vaadin.ui.Window;
import com.vaadin.ui.themes.ValoTheme;

import info.christmann.recs3.tor_master.webinterface.TORMasterWebinterface;
import info.christmann.recs3.tor_master.webinterface.components.AbstractView;
import info.christmann.recs3.tor_master.webinterface.components.MainVerticalShadowLayout;
import info.christmann.recs3.tor_master.webinterface.components.noVNC.NoVNC;

public class OverviewView extends AbstractView {
	private static final long serialVersionUID = 2250135212230558742L;

	private TextField _tf;
	private TextArea _area;
	
	public OverviewView(TORMasterWebinterface app) {
		setSizeFull();
		
		
		
		
		final FancyCssLayout cssLayout = new FancyCssLayout();
		cssLayout.setSlideEnabled(true);
        cssLayout.setSizeFull();
        addComponent(cssLayout);
        setExpandRatio(cssLayout, 12.0f);
		
		MainVerticalShadowLayout leftMainLayout = new MainVerticalShadowLayout("|______Gästebuch______|         ");		
		cssLayout.addComponent(leftMainLayout);

		Label lblMsg = new Label("Bitte hinterlassen sie einen Kommentar");
		leftMainLayout.addComponent(lblMsg);
		
		final FancyCssLayout cssLayoutJ = new FancyCssLayout();
		cssLayoutJ.setSlideEnabled(true);
        cssLayoutJ.setSizeFull();
        addComponent(cssLayoutJ);
        setExpandRatio(cssLayoutJ, 12.0f);
   
//Textfeld(Name)//
      		final FancyCssLayout Press = new FancyCssLayout();
      		Press.setSlideEnabled(true);
              Press.setSizeFull();
              addComponent(Press);
              setExpandRatio(Press, 12.0f);
      		_tf = new TextField("Name");
      		_tf.setValue("");
      		Press.addComponent(_tf);
//Textarea(Kommentar)//
//      		AbsoluteLayout layout = new AbsoluteLayout();
//      		layout.setWidth("1080px");
//      		layout.setHeight("1920px");
      		final FancyCssLayout Kom = new FancyCssLayout();
      		Kom.setSlideEnabled(true);
              Kom.setSizeFull();
              addComponent(Kom);
              setExpandRatio(Kom, 12.0f);
      		_area = new TextArea();
      		_area.setHeight("10em");
      		_area.setWidth("300px");
      		Kom.addComponent(_area);		
		// TODO Auto-generated method stub
      	   //Button//
      		final FancyCssLayout Button = new FancyCssLayout();
      		Button.setSlideEnabled(true);
              Button.setSizeFull();
              addComponent(Button);
              setExpandRatio(Button, 12.0f);
      		Button button = new Button("Kommentar Posten");
      		  Button.addComponent(button);
      		button.addClickListener(new Button.ClickListener(){



      	@Override
      	public void buttonClick(ClickEvent event) {
      		
      		String x =_tf.getValue();
      		String y = _area.getValue();
      		String z = x + "\n" + y; 
      		final FancyCssLayout Name = new FancyCssLayout();
        		Name.setSlideEnabled(true);
                Name.setSizeFull();
                addComponent(Name);
                setExpandRatio(Name, 12.0f);
        		TextArea tf = new TextArea();
        		
        		tf.setValue("Bewertung von "+":" +z);
        		tf.setHeight("10em");
        		tf.setWidth("300px");
        		Name.addComponent(tf);
        		tf.setReadOnly(true);
      		
	}

	});
	
	}
//Bewertungs verfahren//
	private void array() {
	

	}
	

	private String getLoremContent() {
		// TODO Auto-generated method stub
		return null;
	}



	public String getName() {
		return "overview";
	}
}
