package application;


import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class MyController {
	
	private static final MouseEvent MouseEvent = null;
	@FXML
	private Stage stage;
	private Scene scene;
	private Parent root;
	
	@FXML
	private TextField myTextfield;
	@FXML
	private Button myButton;
	
	public void searchClicked(MouseEvent e) {
		String input = myTextfield.getText();
		if (input.equals("Bulbasaur") ||
				input.equals("Ivysaur")	||
				input.equals("Vensaur") ||
				input.equals("Charmander") ||
				input.equals("Charmeleon")	||
				input.equals("Charizard")) 
				{
					switchToMainScene1(e);
				}
		if (input.equals("Squirtle") ||
				input.equals("Wartortle")	||
				input.equals("Blastoise") ||
				input.equals("Caterpie") ||
				input.equals("Metapod")	||
				input.equals("Butterfree")) 
				{
					switchToMainScene2(e);
				}
		if (input.equals("Weedle") ||
				input.equals("Kakuna")	||
				input.equals("Beedrill") ||
				input.equals("Pidgey") ||
				input.equals("Pidgeotto")	||
				input.equals("Pidgeot")) 
				{
					switchToMainScene3(e);
				}
		if (input.equals("Rattata") ||
				input.equals("Raticate")	||
				input.equals("Spearow") ||
				input.equals("Fearow") ||
				input.equals("Ekans")	||
				input.equals("Arbok")) 
				{
					switchToMainScene4(e);
				}
		if (input.equals("Pikachu") ||
				input.equals("Raichu")	||
				input.equals("Sandshrew") ||
				input.equals("Sandslash") ||
				input.equals("Nidoran")	||
				input.equals("Nidorina")) 
				{
					switchToMainScene5(e);
				}
		if (input.equals("Nidoqueen") ||
				input.equals("NidoranFemale")	||
				input.equals("Nidorino") ||
				input.equals("Nidoking") ||
				input.equals("Clefairy")	||
				input.equals("Clefable")) 
				{
					switchToMainScene6(e);
				}
		if (input.equals("Vulpix") ||
				input.equals("Ninetales")	||
				input.equals("Jigglypuff") ||
				input.equals("Wigglytuff") ||
				input.equals("Zubat")	||
				input.equals("Golbat")) 
				{
					switchToMainScene7(e);
				}
		if (input.equals("Oddish") ||
				input.equals("Gloom")	||
				input.equals("Vileplume") ||
				input.equals("Paras") ||
				input.equals("Parasect")	||
				input.equals("Venonat")) 
				{
					switchToMainScene8(e);
				}
		if (input.equals("Venomoth") ||
				input.equals("Diglett")	||
				input.equals("Dugtrtrio") ||
				input.equals("Meowth") ||
				input.equals("Persian")	||
				input.equals("Psyduck")) 
				{
					switchToMainScene9(e);
				}
		if (input.equals("Golduck") ||
				input.equals("Mankey")	||
				input.equals("Primeape") ||
				input.equals("Growlithe") ||
				input.equals("Arcanine")	||
				input.equals("Poliwag")) 
				{
					switchToMainScene10(e);
				}
		if (input.equals("Poliwhirl") ||
				input.equals("Poliwrath")	||
				input.equals("Abra") ||
				input.equals("Kadabra") ||
				input.equals("Alakazam")	||
				input.equals("Machop")) 
				{
					switchToMainScene11(e);
				}
		if (input.equals("Machoke") ||
				input.equals("Machamp")	||
				input.equals("Bellsprout") ||
				input.equals("Weepinbell") ||
				input.equals("Victreebell")	||
				input.equals("Tentacool")) 
				{
					switchToMainScene12(e);
				}
		if (input.equals("Tentacruel") ||
				input.equals("Geodude")	||
				input.equals("Graveler") ||
				input.equals("Golem") ||
				input.equals("Ponyta")	||
				input.equals("Rapidash")) 
				{
					switchToMainScene13(e);
				}
		if (input.equals("Slowpoke") ||
				input.equals("Slowbro")	||
				input.equals("Magnemite") ||
				input.equals("Magneton") ||
				input.equals("Farfetchd")	||
				input.equals("Dodou")) 
				{
					switchToMainScene14(e);
				}
		if (input.equals("Dodrio") ||
				input.equals("Seel")	||
				input.equals("Dewgong") ||
				input.equals("Grimer") ||
				input.equals("Muk")	||
				input.equals("Shellder")) 
				{
					switchToMainScene15(e);
				}
		if (input.equals("Cloyster") ||
				input.equals("Gastly")	||
				input.equals("Haunter") ||
				input.equals("Gengar") ||
				input.equals("Onix")	||
				input.equals("Drowzee")) 
				{
					switchToMainScene16(e);
				}
		if (input.equals("Hypno") ||
				input.equals("Krabby")	||
				input.equals("Kingler") ||
				input.equals("Voltorb") ||
				input.equals("Electrode")	||
				input.equals("Exeggcute")) 
				{
					switchToMainScene17(e);
				}
		if (input.equals("Exeggutor") ||
				input.equals("Cubone")	||
				input.equals("Marowak") ||
				input.equals("Hitmonlee") ||
				input.equals("Hitmonchan")	||
				input.equals("Lickitung")) 
				{
					switchToMainScene18(e);
				}
		if (input.equals("Koffing") ||
				input.equals("Weezing")	||
				input.equals("Rhyhorn") ||
				input.equals("Rhydon") ||
				input.equals("Chansey")	||
				input.equals("Tangela")) 
				{
					switchToMainScene19(e);
				}
		if (input.equals("Kangaskhan") ||
				input.equals("Horsea")	||
				input.equals("Seadra") ||
				input.equals("Goldeen") ||
				input.equals("Seaking")	||
				input.equals("Staryu")) 
				{
					switchToMainScene20(e);
				}
		if (input.equals("Starmie") ||
				input.equals("Mr.Mime")	||
				input.equals("Scyther") ||
				input.equals("Jynx") ||
				input.equals("Electabuzz")	||
				input.equals("Magmar")) 
				{
					switchToMainScene21(e);
				}
		if (input.equals("Pinsir") ||
				input.equals("Tauros")	||
				input.equals("Magikarp") ||
				input.equals("Gyarados") ||
				input.equals("Lapras")	||
				input.equals("Ditto")) 
				{
					switchToMainScene22(e);
				}
		if (input.equals("Eevee") ||
				input.equals("Vaporeon")	||
				input.equals("Jolteon") ||
				input.equals("Flareon") ||
				input.equals("Porygon")	||
				input.equals("Omanyte")) 
				{
					switchToMainScene23(e);
				}
		if (input.equals("Omastar") ||
				input.equals("Kabuto")	||
				input.equals("Kabutops") ||
				input.equals("Aerodactyl") ||
				input.equals("Snorlax")	||
				input.equals("Articuno")) 
				{
					switchToMainScene24(e);
				}
		if (input.equals("Zapdos") ||
				input.equals("Moltres")	||
				input.equals("Dratini") ||
				input.equals("Dragonair") ||
				input.equals("Dragonite")	||
				input.equals("Mewto")) 
				{
					switchToMainScene25(e);
				}
		if (input.equals("Mew"))
				{
					switchToMainScene26(e);
				}
	}
	
	public void switchToMainScene1(MouseEvent e) {
		Parent root;
		try {
			root = FXMLLoader.load(getClass().getResource("/application/MainPages/Main1.fxml"));
			stage = (Stage)((Node)e.getSource()).getScene().getWindow();
			scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
		} catch (IOException e1) {
			e1.printStackTrace();
		}		
	}
	
	public void switchToMainScene2(MouseEvent e) {
		Parent root;
		try {
			root = FXMLLoader.load(getClass().getResource("/application/MainPages/Main2.fxml"));
			stage = (Stage)((Node)e.getSource()).getScene().getWindow();
			scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
		} catch (IOException e1) {
			e1.printStackTrace();
		}		
	}
	
	public void switchToMainScene3(MouseEvent e) {
		Parent root;
		try {
			root = FXMLLoader.load(getClass().getResource("/application/MainPages/Main3.fxml"));
			stage = (Stage)((Node)e.getSource()).getScene().getWindow();
			scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
		} catch (IOException e1) {
			e1.printStackTrace();
		}		
	}
	
	public void switchToMainScene4(MouseEvent e) {
		Parent root;
		try {
			root = FXMLLoader.load(getClass().getResource("/application/MainPages/Main4.fxml"));
			stage = (Stage)((Node)e.getSource()).getScene().getWindow();
			scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
		} catch (IOException e1) {
			e1.printStackTrace();
		}		
	}
	
	public void switchToMainScene5(MouseEvent e) {
		Parent root;
		try {
			root = FXMLLoader.load(getClass().getResource("/application/MainPages/Main5.fxml"));
			stage = (Stage)((Node)e.getSource()).getScene().getWindow();
			scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
		} catch (IOException e1) {
			e1.printStackTrace();
		}		
	}
	
	public void switchToMainScene6(MouseEvent e) {
		Parent root;
		try {
			root = FXMLLoader.load(getClass().getResource("/application/MainPages/Main6.fxml"));
			stage = (Stage)((Node)e.getSource()).getScene().getWindow();
			scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
		} catch (IOException e1) {
			e1.printStackTrace();
		}		
	}
	
	public void switchToMainScene7(MouseEvent e) {
		Parent root;
		try {
			root = FXMLLoader.load(getClass().getResource("/application/MainPages/Main7.fxml"));
			stage = (Stage)((Node)e.getSource()).getScene().getWindow();
			scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
		} catch (IOException e1) {
			e1.printStackTrace();
		}		
	}
	
	public void switchToMainScene8(MouseEvent e) {
		Parent root;
		try {
			root = FXMLLoader.load(getClass().getResource("/application/MainPages/Main8.fxml"));
			stage = (Stage)((Node)e.getSource()).getScene().getWindow();
			scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
		} catch (IOException e1) {
			e1.printStackTrace();
		}		
	}
	
	public void switchToMainScene9(MouseEvent e) {
		Parent root;
		try {
			root = FXMLLoader.load(getClass().getResource("/application/MainPages/Main9.fxml"));
			stage = (Stage)((Node)e.getSource()).getScene().getWindow();
			scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
		} catch (IOException e1) {
			e1.printStackTrace();
		}		
	}
	
	public void switchToMainScene10(MouseEvent e) {
		Parent root;
		try {
			root = FXMLLoader.load(getClass().getResource("/application/MainPages/Main10.fxml"));
			stage = (Stage)((Node)e.getSource()).getScene().getWindow();
			scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
		} catch (IOException e1) {
			e1.printStackTrace();
		}		
	}
	
	public void switchToMainScene11(MouseEvent e) {
		Parent root;
		try {
			root = FXMLLoader.load(getClass().getResource("/application/MainPages/Main11.fxml"));
			stage = (Stage)((Node)e.getSource()).getScene().getWindow();
			scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
		} catch (IOException e1) {
			e1.printStackTrace();
		}		
	}
	
	public void switchToMainScene12(MouseEvent e) {
		Parent root;
		try {
			root = FXMLLoader.load(getClass().getResource("/application/MainPages/Main12.fxml"));
			stage = (Stage)((Node)e.getSource()).getScene().getWindow();
			scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
		} catch (IOException e1) {
			e1.printStackTrace();
		}		
	}
	
	public void switchToMainScene13(MouseEvent e) {
		Parent root;
		try {
			root = FXMLLoader.load(getClass().getResource("/application/MainPages/Main13.fxml"));
			stage = (Stage)((Node)e.getSource()).getScene().getWindow();
			scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
		} catch (IOException e1) {
			e1.printStackTrace();
		}		
	}
	
	public void switchToMainScene14(MouseEvent e) {
		Parent root;
		try {
			root = FXMLLoader.load(getClass().getResource("/application/MainPages/Main14.fxml"));
			stage = (Stage)((Node)e.getSource()).getScene().getWindow();
			scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
		} catch (IOException e1) {
			e1.printStackTrace();
		}		
	}
	
	public void switchToMainScene15(MouseEvent e) {
		Parent root;
		try {
			root = FXMLLoader.load(getClass().getResource("/application/MainPages/Main15.fxml"));
			stage = (Stage)((Node)e.getSource()).getScene().getWindow();
			scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
		} catch (IOException e1) {
			e1.printStackTrace();
		}		
	}
	
	public void switchToMainScene16(MouseEvent e) {
		Parent root;
		try {
			root = FXMLLoader.load(getClass().getResource("/application/MainPages/Main16.fxml"));
			stage = (Stage)((Node)e.getSource()).getScene().getWindow();
			scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
		} catch (IOException e1) {
			e1.printStackTrace();
		}		
	}
	
	public void switchToMainScene17(MouseEvent e) {
		Parent root;
		try {
			root = FXMLLoader.load(getClass().getResource("/application/MainPages/Main17.fxml"));
			stage = (Stage)((Node)e.getSource()).getScene().getWindow();
			scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
		} catch (IOException e1) {
			e1.printStackTrace();
		}		
	}
	
	public void switchToMainScene18(MouseEvent e) {
		Parent root;
		try {
			root = FXMLLoader.load(getClass().getResource("/application/MainPages/Main18.fxml"));
			stage = (Stage)((Node)e.getSource()).getScene().getWindow();
			scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
		} catch (IOException e1) {
			e1.printStackTrace();
		}		
	}
	
	public void switchToMainScene19(MouseEvent e) {
		Parent root;
		try {
			root = FXMLLoader.load(getClass().getResource("/application/MainPages/Main19.fxml"));
			stage = (Stage)((Node)e.getSource()).getScene().getWindow();
			scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
		} catch (IOException e1) {
			e1.printStackTrace();
		}		
	}
	
	public void switchToMainScene20(MouseEvent e) {
		Parent root;
		try {
			root = FXMLLoader.load(getClass().getResource("/application/MainPages/Main20.fxml"));
			stage = (Stage)((Node)e.getSource()).getScene().getWindow();
			scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
		} catch (IOException e1) {
			e1.printStackTrace();
		}		
	}
	
	public void switchToMainScene21(MouseEvent e) {
		Parent root;
		try {
			root = FXMLLoader.load(getClass().getResource("/application/MainPages/Main21.fxml"));
			stage = (Stage)((Node)e.getSource()).getScene().getWindow();
			scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
		} catch (IOException e1) {
			e1.printStackTrace();
		}		
	}
	
	public void switchToMainScene22(MouseEvent e) {
		Parent root;
		try {
			root = FXMLLoader.load(getClass().getResource("/application/MainPages/Main22.fxml"));
			stage = (Stage)((Node)e.getSource()).getScene().getWindow();
			scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
		} catch (IOException e1) {
			e1.printStackTrace();
		}		
	}
	
	public void switchToMainScene23(MouseEvent e) {
		Parent root;
		try {
			root = FXMLLoader.load(getClass().getResource("/application/MainPages/Main23.fxml"));
			stage = (Stage)((Node)e.getSource()).getScene().getWindow();
			scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
		} catch (IOException e1) {
			e1.printStackTrace();
		}		
	}
	
	public void switchToMainScene24(MouseEvent e) {
		Parent root;
		try {
			root = FXMLLoader.load(getClass().getResource("/application/MainPages/Main24.fxml"));
			stage = (Stage)((Node)e.getSource()).getScene().getWindow();
			scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
		} catch (IOException e1) {
			e1.printStackTrace();
		}		
	}
	
	public void switchToMainScene25(MouseEvent e) {
		Parent root;
		try {
			root = FXMLLoader.load(getClass().getResource("/application/MainPages/Main25.fxml"));
			stage = (Stage)((Node)e.getSource()).getScene().getWindow();
			scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
		} catch (IOException e1) {
			e1.printStackTrace();
		}		
	}
	
	public void switchToMainScene26(MouseEvent e) {
		Parent root;
		try {
			root = FXMLLoader.load(getClass().getResource("/application/MainPages/Main26.fxml"));
			stage = (Stage)((Node)e.getSource()).getScene().getWindow();
			scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
		} catch (IOException e1) {
			e1.printStackTrace();
		}		
	}
	
	public void switchToDetailsSceneBulbasaur(MouseEvent e) {
		try {
			root = FXMLLoader.load(getClass().getResource("/application/DetailesPages/BulbasaurDetails.fxml"));
			stage = (Stage)((Node)e.getSource()).getScene().getWindow();
			scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
	
	
	
	public void switchToDetailsSceneIvysaur(MouseEvent e) {
		try {
			root = FXMLLoader.load(getClass().getResource("/application/DetailesPages/IvySaurDetails.fxml"));
			stage = (Stage)((Node)e.getSource()).getScene().getWindow();
			scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
	
	public void switchToDetailsSceneVensaur(MouseEvent e) {
		try {
			root = FXMLLoader.load(getClass().getResource("/application/DetailesPages/VensaurDetails.fxml"));
			stage = (Stage)((Node)e.getSource()).getScene().getWindow();
			scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
	
	public void switchToDetailsCharmander(MouseEvent e) {
		try {
			root = FXMLLoader.load(getClass().getResource("/application/DetailesPages/CharmanderDetails.fxml"));
			stage = (Stage)((Node)e.getSource()).getScene().getWindow();
			scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
	
	public void switchToDetailsCharmeleon(MouseEvent e) {
		try {
			root = FXMLLoader.load(getClass().getResource("/application/DetailesPages/CharmeleonDetails.fxml"));
			stage = (Stage)((Node)e.getSource()).getScene().getWindow();
			scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
	
	public void switchToDetailsCharizard(MouseEvent e) {
		try {
			root = FXMLLoader.load(getClass().getResource("/application/DetailesPages/CharizardDetails.fxml"));
			stage = (Stage)((Node)e.getSource()).getScene().getWindow();
			scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
	
	public void switchToDetailsSquirtle(MouseEvent e) {
		try {
			root = FXMLLoader.load(getClass().getResource("/application/DetailesPages/SquirtleDetails.fxml"));
			stage = (Stage)((Node)e.getSource()).getScene().getWindow();
			scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
	
	public void switchToDetailsWartotle(MouseEvent e) {
		try {
			root = FXMLLoader.load(getClass().getResource("/application/DetailesPages/WartotleDetails.fxml"));
			stage = (Stage)((Node)e.getSource()).getScene().getWindow();
			scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
	
	public void switchToDetailsBlastoise(MouseEvent e) {
		try {
			root = FXMLLoader.load(getClass().getResource("/application/DetailesPages/BlastoiseDetails.fxml"));
			stage = (Stage)((Node)e.getSource()).getScene().getWindow();
			scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
	
	public void switchToDetailsCaterpie(MouseEvent e) {
		try {
			root = FXMLLoader.load(getClass().getResource("/application/DetailesPages/CaterpieDetails.fxml"));
			stage = (Stage)((Node)e.getSource()).getScene().getWindow();
			scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
	
	public void switchToDetailsMetapod(MouseEvent e) {
		try {
			root = FXMLLoader.load(getClass().getResource("/application/DetailesPages/MetapodDetails.fxml"));
			stage = (Stage)((Node)e.getSource()).getScene().getWindow();
			scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
	
	public void switchToDetailsButterfree(MouseEvent e) {
		try {
			root = FXMLLoader.load(getClass().getResource("/application/DetailesPages/ButterfreeDetails.fxml"));
			stage = (Stage)((Node)e.getSource()).getScene().getWindow();
			scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
	
	public void switchToDetailsWeedle(MouseEvent e) {
		try {
			root = FXMLLoader.load(getClass().getResource("/application/DetailesPages/WeedleDetails.fxml"));
			stage = (Stage)((Node)e.getSource()).getScene().getWindow();
			scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
	
	public void switchToDetailsKakuna(MouseEvent e) {
		try {
			root = FXMLLoader.load(getClass().getResource("/application/DetailesPages/KakunaDetails.fxml"));
			stage = (Stage)((Node)e.getSource()).getScene().getWindow();
			scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
	
	public void switchToDetailsBeedrill(MouseEvent e) {
		try {
			root = FXMLLoader.load(getClass().getResource("/application/DetailesPages/BeedrillDetails.fxml"));
			stage = (Stage)((Node)e.getSource()).getScene().getWindow();
			scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
	
	public void switchToDetailsPidgey(MouseEvent e) {
		try {
			root = FXMLLoader.load(getClass().getResource("/application/DetailesPages/PidgeyDetails.fxml"));
			stage = (Stage)((Node)e.getSource()).getScene().getWindow();
			scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
	
	public void switchToDetailsPidgeotto(MouseEvent e) {
		try {
			root = FXMLLoader.load(getClass().getResource("/application/DetailesPages/PidgeottoDetails.fxml"));
			stage = (Stage)((Node)e.getSource()).getScene().getWindow();
			scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
	
	public void switchToDetailsPidgeot(MouseEvent e) {
		try {
			root = FXMLLoader.load(getClass().getResource("/application/DetailesPages/PidgeotDetails.fxml"));
			stage = (Stage)((Node)e.getSource()).getScene().getWindow();
			scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
	
	public void switchToDetailsRattata(MouseEvent e) {
		try {
			root = FXMLLoader.load(getClass().getResource("/application/DetailesPages/RattataDetails.fxml"));
			stage = (Stage)((Node)e.getSource()).getScene().getWindow();
			scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
	
	public void switchToDetailsRaticate(MouseEvent e) {
		try {
			root = FXMLLoader.load(getClass().getResource("/application/DetailesPages/RaticateDetails.fxml"));
			stage = (Stage)((Node)e.getSource()).getScene().getWindow();
			scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
	
	public void switchToDetailsSpearow(MouseEvent e) {
		try {
			root = FXMLLoader.load(getClass().getResource("/application/DetailesPages/SpearowDetails.fxml"));
			stage = (Stage)((Node)e.getSource()).getScene().getWindow();
			scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
	
	public void switchToDetailsFearow(MouseEvent e) {
		try {
			root = FXMLLoader.load(getClass().getResource("/application/DetailesPages/FearowDetails.fxml"));
			stage = (Stage)((Node)e.getSource()).getScene().getWindow();
			scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
	
	public void switchToDetailsEkans(MouseEvent e) {
		try {
			root = FXMLLoader.load(getClass().getResource("/application/DetailesPages/EkansDetails.fxml"));
			stage = (Stage)((Node)e.getSource()).getScene().getWindow();
			scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
	
	public void switchToDetailsArbok(MouseEvent e) {
		try {
			root = FXMLLoader.load(getClass().getResource("/application/DetailesPages/ArbokDetails.fxml"));
			stage = (Stage)((Node)e.getSource()).getScene().getWindow();
			scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
	
	public void switchToDetailsPikachu(MouseEvent e) {
		try {
			root = FXMLLoader.load(getClass().getResource("/application/DetailesPages/PikachuDetails.fxml"));
			stage = (Stage)((Node)e.getSource()).getScene().getWindow();
			scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}

	public void switchToDetailsRaichu(MouseEvent e) {
		try {
			root = FXMLLoader.load(getClass().getResource("/application/DetailesPages/RaichuDetails.fxml"));
			stage = (Stage)((Node)e.getSource()).getScene().getWindow();
			scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}

	public void switchToDetailsSandshrew(MouseEvent e) {
		try {
			root = FXMLLoader.load(getClass().getResource("/application/DetailesPages/SandshrewDetails.fxml"));
			stage = (Stage)((Node)e.getSource()).getScene().getWindow();
			scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}

	public void switchToDetailsSandslash(MouseEvent e) {
		try {
			root = FXMLLoader.load(getClass().getResource("/application/DetailesPages/SandslashDetails.fxml"));
			stage = (Stage)((Node)e.getSource()).getScene().getWindow();
			scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}

	public void switchToDetailsNidoran(MouseEvent e) {
		try {
			root = FXMLLoader.load(getClass().getResource("/application/DetailesPages/NidoranDetails.fxml"));
			stage = (Stage)((Node)e.getSource()).getScene().getWindow();
			scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}

	public void switchToDetailsNidorina(MouseEvent e) {
		try {
			root = FXMLLoader.load(getClass().getResource("/application/DetailesPages/NidorinaDetails.fxml"));
			stage = (Stage)((Node)e.getSource()).getScene().getWindow();
			scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}

	public void switchToDetailsNidoqueen(MouseEvent e) {
		try {
			root = FXMLLoader.load(getClass().getResource("/application/DetailesPages/NidoqueenDetails.fxml"));
			stage = (Stage)((Node)e.getSource()).getScene().getWindow();
			scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
	
	public void switchToDetailsNidoranFemale(MouseEvent e) {
		try {
			root = FXMLLoader.load(getClass().getResource("/application/DetailesPages/NidoranFemaleDetails.fxml"));
			stage = (Stage)((Node)e.getSource()).getScene().getWindow();
			scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
	
	public void switchToDetailsNidorino(MouseEvent e) {
		try {
			root = FXMLLoader.load(getClass().getResource("/application/DetailesPages/NidorinoDetails.fxml"));
			stage = (Stage)((Node)e.getSource()).getScene().getWindow();
			scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
	
	public void switchToDetailsNidoking(MouseEvent e) {
		try {
			root = FXMLLoader.load(getClass().getResource("/application/DetailesPages/NidokingDetails.fxml"));
			stage = (Stage)((Node)e.getSource()).getScene().getWindow();
			scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
	
	public void switchToDetailsClefairy(MouseEvent e) {
		try {
			root = FXMLLoader.load(getClass().getResource("/application/DetailesPages/ClefairyDetails.fxml"));
			stage = (Stage)((Node)e.getSource()).getScene().getWindow();
			scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
	
	public void switchToDetailsClefable(MouseEvent e) {
		try {
			root = FXMLLoader.load(getClass().getResource("/application/DetailesPages/ClefableDetails.fxml"));
			stage = (Stage)((Node)e.getSource()).getScene().getWindow();
			scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
	
	public void switchToDetailsVulpix(MouseEvent e) {
		try {
			root = FXMLLoader.load(getClass().getResource("/application/DetailesPages/VulpixDetails.fxml"));
			stage = (Stage)((Node)e.getSource()).getScene().getWindow();
			scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
	
	public void switchToDetailsNinetails(MouseEvent e) {
		try {
			root = FXMLLoader.load(getClass().getResource("/application/DetailesPages/NinetailsDetails.fxml"));
			stage = (Stage)((Node)e.getSource()).getScene().getWindow();
			scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
	
	public void switchToDetailsJigglypuff(MouseEvent e) {
		try {
			root = FXMLLoader.load(getClass().getResource("/application/DetailesPages/JigglypuffDetails.fxml"));
			stage = (Stage)((Node)e.getSource()).getScene().getWindow();
			scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
	
	public void switchToDetailsWigglytuff(MouseEvent e) {
		try {
			root = FXMLLoader.load(getClass().getResource("/application/DetailesPages/WigglytuffDetails.fxml"));
			stage = (Stage)((Node)e.getSource()).getScene().getWindow();
			scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
	
	public void switchToDetailsZubat(MouseEvent e) {
		try {
			root = FXMLLoader.load(getClass().getResource("/application/DetailesPages/ZubatDetails.fxml"));
			stage = (Stage)((Node)e.getSource()).getScene().getWindow();
			scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
	
	public void switchToDetailsGolbat(MouseEvent e) {
		try {
			root = FXMLLoader.load(getClass().getResource("/application/DetailesPages/GolbatDetails.fxml"));
			stage = (Stage)((Node)e.getSource()).getScene().getWindow();
			scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
	
	public void switchToDetailsOddish(MouseEvent e) {
		try {
			root = FXMLLoader.load(getClass().getResource("/application/DetailesPages/OddishDetails.fxml"));
			stage = (Stage)((Node)e.getSource()).getScene().getWindow();
			scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
	
	public void switchToDetailsGloom(MouseEvent e) {
		try {
			root = FXMLLoader.load(getClass().getResource("/application/DetailesPages/GloomDetails.fxml"));
			stage = (Stage)((Node)e.getSource()).getScene().getWindow();
			scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
	
	public void switchToDetailsVileplume(MouseEvent e) {
		try {
			root = FXMLLoader.load(getClass().getResource("/application/DetailesPages/VileplumeDetails.fxml"));
			stage = (Stage)((Node)e.getSource()).getScene().getWindow();
			scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
	
	public void switchToDetailsParas(MouseEvent e) {
		try {
			root = FXMLLoader.load(getClass().getResource("/application/DetailesPages/ParasDetails.fxml"));
			stage = (Stage)((Node)e.getSource()).getScene().getWindow();
			scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
	
	public void switchToDetailsParasect(MouseEvent e) {
		try {
			root = FXMLLoader.load(getClass().getResource("/application/DetailesPages/ParasectDetails.fxml"));
			stage = (Stage)((Node)e.getSource()).getScene().getWindow();
			scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
	
	public void switchToDetailsVenonat(MouseEvent e) {
		try {
			root = FXMLLoader.load(getClass().getResource("/application/DetailesPages/VenonatDetails.fxml"));
			stage = (Stage)((Node)e.getSource()).getScene().getWindow();
			scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
	
	public void switchToDetailsVenomoth(MouseEvent e) {
		try {
			root = FXMLLoader.load(getClass().getResource("/application/DetailesPages/VenomothDetails.fxml"));
			stage = (Stage)((Node)e.getSource()).getScene().getWindow();
			scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
	
	public void switchToDetailsDiglett(MouseEvent e) {
		try {
			root = FXMLLoader.load(getClass().getResource("/application/DetailesPages/DiglettDetails.fxml"));
			stage = (Stage)((Node)e.getSource()).getScene().getWindow();
			scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
	
	public void switchToDetailsDugtrio(MouseEvent e) {
		try {
			root = FXMLLoader.load(getClass().getResource("/application/DetailesPages/DugtrioDetails.fxml"));
			stage = (Stage)((Node)e.getSource()).getScene().getWindow();
			scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
	
	public void switchToDetailsMeowth(MouseEvent e) {
		try {
			root = FXMLLoader.load(getClass().getResource("/application/DetailesPages/MeowthDetails.fxml"));
			stage = (Stage)((Node)e.getSource()).getScene().getWindow();
			scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
	
	public void switchToDetailsPersian(MouseEvent e) {
		try {
			root = FXMLLoader.load(getClass().getResource("/application/DetailesPages/PersianDetails.fxml"));
			stage = (Stage)((Node)e.getSource()).getScene().getWindow();
			scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}

	public void switchToDetailsPsyduck(MouseEvent e) {
		try {
			root = FXMLLoader.load(getClass().getResource("/application/DetailesPages/PsyduckDetails.fxml"));
			stage = (Stage)((Node)e.getSource()).getScene().getWindow();
			scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
	
	public void switchToDetailsGolduck(MouseEvent e) {
		try {
			root = FXMLLoader.load(getClass().getResource("/application/DetailesPages/GolduckDetails.fxml"));
			stage = (Stage)((Node)e.getSource()).getScene().getWindow();
			scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
	
	public void switchToDetailsMankey(MouseEvent e) {
		try {
			root = FXMLLoader.load(getClass().getResource("/application/DetailesPages/MankeyDetails.fxml"));
			stage = (Stage)((Node)e.getSource()).getScene().getWindow();
			scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
	
	public void switchToDetailsPrimeape(MouseEvent e) {
		try {
			root = FXMLLoader.load(getClass().getResource("/application/DetailesPages/PrimeapeDetails.fxml"));
			stage = (Stage)((Node)e.getSource()).getScene().getWindow();
			scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
	
	public void switchToDetailsGrowlithe(MouseEvent e) {
		try {
			root = FXMLLoader.load(getClass().getResource("/application/DetailesPages/GrowlitheDetails.fxml"));
			stage = (Stage)((Node)e.getSource()).getScene().getWindow();
			scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
	
	public void switchToDetailsArcanine(MouseEvent e) {
		try {
			root = FXMLLoader.load(getClass().getResource("/application/DetailesPages/ArcanineDetails.fxml"));
			stage = (Stage)((Node)e.getSource()).getScene().getWindow();
			scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
	
	public void switchToDetailsPoliwag(MouseEvent e) {
		try {
			root = FXMLLoader.load(getClass().getResource("/application/DetailesPages/PoliwagDetails.fxml"));
			stage = (Stage)((Node)e.getSource()).getScene().getWindow();
			scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
	
	public void switchToDetailsPoliwhirl(MouseEvent e) {
		try {
			root = FXMLLoader.load(getClass().getResource("/application/DetailesPages/PoliwhirlDetails.fxml"));
			stage = (Stage)((Node)e.getSource()).getScene().getWindow();
			scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
	
	public void switchToDetailsPoliwrath(MouseEvent e) {
		try {
			root = FXMLLoader.load(getClass().getResource("/application/DetailesPages/PoliwrathDetails.fxml"));
			stage = (Stage)((Node)e.getSource()).getScene().getWindow();
			scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
	
	public void switchToDetailsAbra(MouseEvent e) {
		try {
			root = FXMLLoader.load(getClass().getResource("/application/DetailesPages/AbraDetails.fxml"));
			stage = (Stage)((Node)e.getSource()).getScene().getWindow();
			scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
	
	public void switchToDetailsKadabra(MouseEvent e) {
		try {
			root = FXMLLoader.load(getClass().getResource("/application/DetailesPages/KadabraDetails.fxml"));
			stage = (Stage)((Node)e.getSource()).getScene().getWindow();
			scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
	
	public void switchToDetailsAlakazam(MouseEvent e) {
		try {
			root = FXMLLoader.load(getClass().getResource("/application/DetailesPages/AlakazamDetails.fxml"));
			stage = (Stage)((Node)e.getSource()).getScene().getWindow();
			scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
	
	public void switchToDetailsMachop(MouseEvent e) {
		try {
			root = FXMLLoader.load(getClass().getResource("/application/DetailesPages/MachopDetails.fxml"));
			stage = (Stage)((Node)e.getSource()).getScene().getWindow();
			scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
	
	public void switchToDetailsMachoke(MouseEvent e) {
		try {
			root = FXMLLoader.load(getClass().getResource("/application/DetailesPages/MachokeDetails.fxml"));
			stage = (Stage)((Node)e.getSource()).getScene().getWindow();
			scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
	
	public void switchToDetailsMachamp(MouseEvent e) {
		try {
			root = FXMLLoader.load(getClass().getResource("/application/DetailesPages/MachampDetails.fxml"));
			stage = (Stage)((Node)e.getSource()).getScene().getWindow();
			scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
	
	public void switchToDetailsBellsprout(MouseEvent e) {
		try {
			root = FXMLLoader.load(getClass().getResource("/application/DetailesPages/BellsproutDetails.fxml"));
			stage = (Stage)((Node)e.getSource()).getScene().getWindow();
			scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
	
	public void switchToDetailsWeepinbell(MouseEvent e) {
		try {
			root = FXMLLoader.load(getClass().getResource("/application/DetailesPages/WeepinbellDetails.fxml"));
			stage = (Stage)((Node)e.getSource()).getScene().getWindow();
			scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
	
	public void switchToDetailsVictreebell(MouseEvent e) {
		try {
			root = FXMLLoader.load(getClass().getResource("/application/DetailesPages/VictreebellDetails.fxml"));
			stage = (Stage)((Node)e.getSource()).getScene().getWindow();
			scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
	
	public void switchToDetailsTentacool(MouseEvent e) {
		try {
			root = FXMLLoader.load(getClass().getResource("/application/DetailesPages/TentacoolDetails.fxml"));
			stage = (Stage)((Node)e.getSource()).getScene().getWindow();
			scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
	
	public void switchToDetailsTentacruel(MouseEvent e) {
		try {
			root = FXMLLoader.load(getClass().getResource("/application/DetailesPages/TentacruelDetails.fxml"));
			stage = (Stage)((Node)e.getSource()).getScene().getWindow();
			scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
	
	public void switchToDetailsGeodude(MouseEvent e) {
		try {
			root = FXMLLoader.load(getClass().getResource("/application/DetailesPages/GeodudeDetails.fxml"));
			stage = (Stage)((Node)e.getSource()).getScene().getWindow();
			scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
	
	public void switchToDetailsGraveler(MouseEvent e) {
		try {
			root = FXMLLoader.load(getClass().getResource("/application/DetailesPages/GravelerDetails.fxml"));
			stage = (Stage)((Node)e.getSource()).getScene().getWindow();
			scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
	
	public void switchToDetailsGolem(MouseEvent e) {
		try {
			root = FXMLLoader.load(getClass().getResource("/application/DetailesPages/GolemDetails.fxml"));
			stage = (Stage)((Node)e.getSource()).getScene().getWindow();
			scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
	
	public void switchToDetailsPonyta(MouseEvent e) {
		try {
			root = FXMLLoader.load(getClass().getResource("/application/DetailesPages/PonytaDetails.fxml"));
			stage = (Stage)((Node)e.getSource()).getScene().getWindow();
			scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
	
	public void switchToDetailsRapidash(MouseEvent e) {
		try {
			root = FXMLLoader.load(getClass().getResource("/application/DetailesPages/RapidashDetails.fxml"));
			stage = (Stage)((Node)e.getSource()).getScene().getWindow();
			scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
	
	public void switchToDetailsSlowpoke(MouseEvent e) {
		try {
			root = FXMLLoader.load(getClass().getResource("/application/DetailesPages/SlowpokeDetails.fxml"));
			stage = (Stage)((Node)e.getSource()).getScene().getWindow();
			scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
	
	public void switchToDetailsSlowbro(MouseEvent e) {
		try {
			root = FXMLLoader.load(getClass().getResource("/application/DetailesPages/SlowbroDetails.fxml"));
			stage = (Stage)((Node)e.getSource()).getScene().getWindow();
			scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
	
	public void switchToDetailsMagnemite(MouseEvent e) {
		try {
			root = FXMLLoader.load(getClass().getResource("/application/DetailesPages/MagnemiteDetails.fxml"));
			stage = (Stage)((Node)e.getSource()).getScene().getWindow();
			scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
	
	public void switchToDetailsMagneton(MouseEvent e) {
		try {
			root = FXMLLoader.load(getClass().getResource("/application/DetailesPages/MagnetonDetails.fxml"));
			stage = (Stage)((Node)e.getSource()).getScene().getWindow();
			scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
	
	public void switchToDetailsFarfetchd(MouseEvent e) {
		try {
			root = FXMLLoader.load(getClass().getResource("/application/DetailesPages/FarfetchdDetails.fxml"));
			stage = (Stage)((Node)e.getSource()).getScene().getWindow();
			scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
	
	public void switchToDetailsDodou(MouseEvent e) {
		try {
			root = FXMLLoader.load(getClass().getResource("/application/DetailesPages/DodouDetails.fxml"));
			stage = (Stage)((Node)e.getSource()).getScene().getWindow();
			scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
	
	public void switchToDetailsDodrio(MouseEvent e) {
		try {
			root = FXMLLoader.load(getClass().getResource("/application/DetailesPages/DodrioDetails.fxml"));
			stage = (Stage)((Node)e.getSource()).getScene().getWindow();
			scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
	
	public void switchToDetailsSeel(MouseEvent e) {
		try {
			root = FXMLLoader.load(getClass().getResource("/application/DetailesPages/SeelDetails.fxml"));
			stage = (Stage)((Node)e.getSource()).getScene().getWindow();
			scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
	
	public void switchToDetailsDewgong(MouseEvent e) {
		try {
			root = FXMLLoader.load(getClass().getResource("/application/DetailesPages/DewgongDetails.fxml"));
			stage = (Stage)((Node)e.getSource()).getScene().getWindow();
			scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
	
	public void switchToDetailsGrimer(MouseEvent e) {
		try {
			root = FXMLLoader.load(getClass().getResource("/application/DetailesPages/GrimerDetails.fxml"));
			stage = (Stage)((Node)e.getSource()).getScene().getWindow();
			scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
	
	public void switchToDetailsMuk(MouseEvent e) {
		try {
			root = FXMLLoader.load(getClass().getResource("/application/DetailesPages/MukDetails.fxml"));
			stage = (Stage)((Node)e.getSource()).getScene().getWindow();
			scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
	
	public void switchToDetailsShellder(MouseEvent e) {
		try {
			root = FXMLLoader.load(getClass().getResource("/application/DetailesPages/ShellderDetails.fxml"));
			stage = (Stage)((Node)e.getSource()).getScene().getWindow();
			scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
	
	public void switchToDetailsCloyster(MouseEvent e) {
		try {
			root = FXMLLoader.load(getClass().getResource("/application/DetailesPages/CloysterDetails.fxml"));
			stage = (Stage)((Node)e.getSource()).getScene().getWindow();
			scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
	
	public void switchToDetailsGastly(MouseEvent e) {
		try {
			root = FXMLLoader.load(getClass().getResource("/application/DetailesPages/GastlyDetails.fxml"));
			stage = (Stage)((Node)e.getSource()).getScene().getWindow();
			scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
	
	public void switchToDetailsHaunter(MouseEvent e) {
		try {
			root = FXMLLoader.load(getClass().getResource("/application/DetailesPages/HaunterDetails.fxml"));
			stage = (Stage)((Node)e.getSource()).getScene().getWindow();
			scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
	
	public void switchToDetailsGengar(MouseEvent e) {
		try {
			root = FXMLLoader.load(getClass().getResource("/application/DetailesPages/GengarDetails.fxml"));
			stage = (Stage)((Node)e.getSource()).getScene().getWindow();
			scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
	
	public void switchToDetailsOnix(MouseEvent e) {
		try {
			root = FXMLLoader.load(getClass().getResource("/application/DetailesPages/OnixDetails.fxml"));
			stage = (Stage)((Node)e.getSource()).getScene().getWindow();
			scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
	
	public void switchToDetailsDrowzee(MouseEvent e) {
		try {
			root = FXMLLoader.load(getClass().getResource("/application/DetailesPages/DrowzeeDetails.fxml"));
			stage = (Stage)((Node)e.getSource()).getScene().getWindow();
			scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
	
	public void switchToDetailsHypno(MouseEvent e) {
		try {
			root = FXMLLoader.load(getClass().getResource("/application/DetailesPages/HypnoDetails.fxml"));
			stage = (Stage)((Node)e.getSource()).getScene().getWindow();
			scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
	
	public void switchToDetailsKrabby(MouseEvent e) {
		try {
			root = FXMLLoader.load(getClass().getResource("/application/DetailesPages/KrabbyDetails.fxml"));
			stage = (Stage)((Node)e.getSource()).getScene().getWindow();
			scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
	
	public void switchToDetailsKingler(MouseEvent e) {
		try {
			root = FXMLLoader.load(getClass().getResource("/application/DetailesPages/KinglerDetails.fxml"));
			stage = (Stage)((Node)e.getSource()).getScene().getWindow();
			scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
	
	public void switchToDetailsVoltorb(MouseEvent e) {
		try {
			root = FXMLLoader.load(getClass().getResource("/application/DetailesPages/VoltorbDetails.fxml"));
			stage = (Stage)((Node)e.getSource()).getScene().getWindow();
			scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
	
	public void switchToDetailsElectrode(MouseEvent e) {
		try {
			root = FXMLLoader.load(getClass().getResource("/application/DetailesPages/ElectrodeDetails.fxml"));
			stage = (Stage)((Node)e.getSource()).getScene().getWindow();
			scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
	
	public void switchToDetailsExeggcute(MouseEvent e) {
		try {
			root = FXMLLoader.load(getClass().getResource("/application/DetailesPages/ExeggcuteDetails.fxml"));
			stage = (Stage)((Node)e.getSource()).getScene().getWindow();
			scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
	
	public void switchToDetailsExeggutor(MouseEvent e) {
		try {
			root = FXMLLoader.load(getClass().getResource("/application/DetailesPages/ExeggutorDetails.fxml"));
			stage = (Stage)((Node)e.getSource()).getScene().getWindow();
			scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
	
	public void switchToDetailsCubone(MouseEvent e) {
		try {
			root = FXMLLoader.load(getClass().getResource("/application/DetailesPages/CuboneDetails.fxml"));
			stage = (Stage)((Node)e.getSource()).getScene().getWindow();
			scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
	
	public void switchToDetailsMarowak(MouseEvent e) {
		try {
			root = FXMLLoader.load(getClass().getResource("/application/DetailesPages/MarowakDetails.fxml"));
			stage = (Stage)((Node)e.getSource()).getScene().getWindow();
			scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
	
	public void switchToDetailsHitmonlee(MouseEvent e) {
		try {
			root = FXMLLoader.load(getClass().getResource("/application/DetailesPages/HitmonleeDetails.fxml"));
			stage = (Stage)((Node)e.getSource()).getScene().getWindow();
			scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
	
	public void switchToDetailsHitmonchan(MouseEvent e) {
		try {
			root = FXMLLoader.load(getClass().getResource("/application/DetailesPages/HitmonchanDetails.fxml"));
			stage = (Stage)((Node)e.getSource()).getScene().getWindow();
			scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
	
	public void switchToDetailsLickitung(MouseEvent e) {
		try {
			root = FXMLLoader.load(getClass().getResource("/application/DetailesPages/LickitungDetails.fxml"));
			stage = (Stage)((Node)e.getSource()).getScene().getWindow();
			scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
	
	public void switchToDetailsKoffing(MouseEvent e) {
		try {
			root = FXMLLoader.load(getClass().getResource("/application/DetailesPages/KoffingDetails.fxml"));
			stage = (Stage)((Node)e.getSource()).getScene().getWindow();
			scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
	
	public void switchToDetailsWeezing(MouseEvent e) {
		try {
			root = FXMLLoader.load(getClass().getResource("/application/DetailesPages/WeezingDetails.fxml"));
			stage = (Stage)((Node)e.getSource()).getScene().getWindow();
			scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
	
	public void switchToDetailsRhyhorn(MouseEvent e) {
		try {
			root = FXMLLoader.load(getClass().getResource("/application/DetailesPages/RhyhornDetails.fxml"));
			stage = (Stage)((Node)e.getSource()).getScene().getWindow();
			scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
	
	public void switchToDetailsRhydon(MouseEvent e) {
		try {
			root = FXMLLoader.load(getClass().getResource("/application/DetailesPages/RhydonDetails.fxml"));
			stage = (Stage)((Node)e.getSource()).getScene().getWindow();
			scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
	
	public void switchToDetailsChansey(MouseEvent e) {
		try {
			root = FXMLLoader.load(getClass().getResource("/application/DetailesPages/ChanseyDetails.fxml"));
			stage = (Stage)((Node)e.getSource()).getScene().getWindow();
			scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
	
	public void switchToDetailsTangela(MouseEvent e) {
		try {
			root = FXMLLoader.load(getClass().getResource("/application/DetailesPages/TangelaDetails.fxml"));
			stage = (Stage)((Node)e.getSource()).getScene().getWindow();
			scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
	
	public void switchToDetailsKangaskhan(MouseEvent e) {
		try {
			root = FXMLLoader.load(getClass().getResource("/application/DetailesPages/KangaskhanDetails.fxml"));
			stage = (Stage)((Node)e.getSource()).getScene().getWindow();
			scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
	
	public void switchToDetailsHorsea(MouseEvent e) {
		try {
			root = FXMLLoader.load(getClass().getResource("/application/DetailesPages/HorseaDetails.fxml"));
			stage = (Stage)((Node)e.getSource()).getScene().getWindow();
			scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
	
	public void switchToDetailsSeadra(MouseEvent e) {
		try {
			root = FXMLLoader.load(getClass().getResource("/application/DetailesPages/SeadraDetails.fxml"));
			stage = (Stage)((Node)e.getSource()).getScene().getWindow();
			scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
	
	public void switchToDetailsGoldeen(MouseEvent e) {
		try {
			root = FXMLLoader.load(getClass().getResource("/application/DetailesPages/GoldeenDetails.fxml"));
			stage = (Stage)((Node)e.getSource()).getScene().getWindow();
			scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
	
	public void switchToDetailsSeaking(MouseEvent e) {
		try {
			root = FXMLLoader.load(getClass().getResource("/application/DetailesPages/SeakingDetails.fxml"));
			stage = (Stage)((Node)e.getSource()).getScene().getWindow();
			scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
	
	public void switchToDetailsStaryu(MouseEvent e) {
		try {
			root = FXMLLoader.load(getClass().getResource("/application/DetailesPages/StaryuDetails.fxml"));
			stage = (Stage)((Node)e.getSource()).getScene().getWindow();
			scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
	
	public void switchToDetailsStarmie(MouseEvent e) {
		try {
			root = FXMLLoader.load(getClass().getResource("/application/DetailesPages/StarmieDetails.fxml"));
			stage = (Stage)((Node)e.getSource()).getScene().getWindow();
			scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
	
	public void switchToDetailsMrMime(MouseEvent e) {
		try {
			root = FXMLLoader.load(getClass().getResource("/application/DetailesPages/MrMimeDetails.fxml"));
			stage = (Stage)((Node)e.getSource()).getScene().getWindow();
			scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
	
	public void switchToDetailsScyther(MouseEvent e) {
		try {
			root = FXMLLoader.load(getClass().getResource("/application/DetailesPages/ScytherDetails.fxml"));
			stage = (Stage)((Node)e.getSource()).getScene().getWindow();
			scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
	
	public void switchToDetailsJynx(MouseEvent e) {
		try {
			root = FXMLLoader.load(getClass().getResource("/application/DetailesPages/JynxDetails.fxml"));
			stage = (Stage)((Node)e.getSource()).getScene().getWindow();
			scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
	
	public void switchToDetailsElectabuzz(MouseEvent e) {
		try {
			root = FXMLLoader.load(getClass().getResource("/application/DetailesPages/ElectabuzzDetails.fxml"));
			stage = (Stage)((Node)e.getSource()).getScene().getWindow();
			scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
	
	public void switchToDetailsMagmar(MouseEvent e) {
		try {
			root = FXMLLoader.load(getClass().getResource("/application/DetailesPages/MagmarDetails.fxml"));
			stage = (Stage)((Node)e.getSource()).getScene().getWindow();
			scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
	
	public void switchToDetailsPinsir(MouseEvent e) {
		try {
			root = FXMLLoader.load(getClass().getResource("/application/DetailesPages/PinsirDetails.fxml"));
			stage = (Stage)((Node)e.getSource()).getScene().getWindow();
			scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
	
	public void switchToDetailsTauros(MouseEvent e) {
		try {
			root = FXMLLoader.load(getClass().getResource("/application/DetailesPages/TaurosDetails.fxml"));
			stage = (Stage)((Node)e.getSource()).getScene().getWindow();
			scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
	
	public void switchToDetailsMagikarp(MouseEvent e) {
		try {
			root = FXMLLoader.load(getClass().getResource("/application/DetailesPages/MagikarpDetails.fxml"));
			stage = (Stage)((Node)e.getSource()).getScene().getWindow();
			scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
	
	public void switchToDetailsGyarados(MouseEvent e) {
		try {
			root = FXMLLoader.load(getClass().getResource("/application/DetailesPages/GyaradosDetails.fxml"));
			stage = (Stage)((Node)e.getSource()).getScene().getWindow();
			scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
	
	public void switchToDetailsLapras(MouseEvent e) {
		try {
			root = FXMLLoader.load(getClass().getResource("/application/DetailesPages/LaprasDetails.fxml"));
			stage = (Stage)((Node)e.getSource()).getScene().getWindow();
			scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
	
	public void switchToDetailsDitto(MouseEvent e) {
		try {
			root = FXMLLoader.load(getClass().getResource("/application/DetailesPages/DittoDetails.fxml"));
			stage = (Stage)((Node)e.getSource()).getScene().getWindow();
			scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
	
	public void switchToDetailsEevee(MouseEvent e) {
		try {
			root = FXMLLoader.load(getClass().getResource("/application/DetailesPages/EeveeDetails.fxml"));
			stage = (Stage)((Node)e.getSource()).getScene().getWindow();
			scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
	
	public void switchToDetailsVaporeon(MouseEvent e) {
		try {
			root = FXMLLoader.load(getClass().getResource("/application/DetailesPages/VaporeonDetails.fxml"));
			stage = (Stage)((Node)e.getSource()).getScene().getWindow();
			scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
	
	public void switchToDetailsJolteon(MouseEvent e) {
		try {
			root = FXMLLoader.load(getClass().getResource("/application/DetailesPages/JolteonDetails.fxml"));
			stage = (Stage)((Node)e.getSource()).getScene().getWindow();
			scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
	
	public void switchToDetailsFlareon(MouseEvent e) {
		try {
			root = FXMLLoader.load(getClass().getResource("/application/DetailesPages/FlareonDetails.fxml"));
			stage = (Stage)((Node)e.getSource()).getScene().getWindow();
			scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
	
	public void switchToDetailsPorygon(MouseEvent e) {
		try {
			root = FXMLLoader.load(getClass().getResource("/application/DetailesPages/PorygonDetails.fxml"));
			stage = (Stage)((Node)e.getSource()).getScene().getWindow();
			scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
	
	public void switchToDetailsOmanyte(MouseEvent e) {
		try {
			root = FXMLLoader.load(getClass().getResource("/application/DetailesPages/OmanyteDetails.fxml"));
			stage = (Stage)((Node)e.getSource()).getScene().getWindow();
			scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
	
	public void switchToDetailsOmastar(MouseEvent e) {
		try {
			root = FXMLLoader.load(getClass().getResource("/application/DetailesPages/OmastarDetails.fxml"));
			stage = (Stage)((Node)e.getSource()).getScene().getWindow();
			scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
	
	public void switchToDetailsKabuto(MouseEvent e) {
		try {
			root = FXMLLoader.load(getClass().getResource("/application/DetailesPages/KabutoDetails.fxml"));
			stage = (Stage)((Node)e.getSource()).getScene().getWindow();
			scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
	
	public void switchToDetailsKabutops(MouseEvent e) {
		try {
			root = FXMLLoader.load(getClass().getResource("/application/DetailesPages/KabutopsDetails.fxml"));
			stage = (Stage)((Node)e.getSource()).getScene().getWindow();
			scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
	
	public void switchToDetailsAerodactyl(MouseEvent e) {
		try {
			root = FXMLLoader.load(getClass().getResource("/application/DetailesPages/AerodactylDetails.fxml"));
			stage = (Stage)((Node)e.getSource()).getScene().getWindow();
			scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
	
	public void switchToDetailsSnorlax(MouseEvent e) {
		try {
			root = FXMLLoader.load(getClass().getResource("/application/DetailesPages/SnorlaxDetails.fxml"));
			stage = (Stage)((Node)e.getSource()).getScene().getWindow();
			scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
	
	public void switchToDetailsArticuno(MouseEvent e) {
		try {
			root = FXMLLoader.load(getClass().getResource("/application/DetailesPages/ArticunoDetails.fxml"));
			stage = (Stage)((Node)e.getSource()).getScene().getWindow();
			scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
	
	public void switchToDetailsZapdos(MouseEvent e) {
		try {
			root = FXMLLoader.load(getClass().getResource("/application/DetailesPages/ZapdosDetails.fxml"));
			stage = (Stage)((Node)e.getSource()).getScene().getWindow();
			scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
	
	public void switchToDetailsMoltres(MouseEvent e) {
		try {
			root = FXMLLoader.load(getClass().getResource("/application/DetailesPages/MoltresDetails.fxml"));
			stage = (Stage)((Node)e.getSource()).getScene().getWindow();
			scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
	
	public void switchToDetailsDratini(MouseEvent e) {
		try {
			root = FXMLLoader.load(getClass().getResource("/application/DetailesPages/DratiniDetails.fxml"));
			stage = (Stage)((Node)e.getSource()).getScene().getWindow();
			scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
	
	public void switchToDetailsDragonair(MouseEvent e) {
		try {
			root = FXMLLoader.load(getClass().getResource("/application/DetailesPages/DragonairDetails.fxml"));
			stage = (Stage)((Node)e.getSource()).getScene().getWindow();
			scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
	
	public void switchToDetailsDragonite(MouseEvent e) {
		try {
			root = FXMLLoader.load(getClass().getResource("/application/DetailesPages/DragoniteDetails.fxml"));
			stage = (Stage)((Node)e.getSource()).getScene().getWindow();
			scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
	
	public void switchToDetailsMewtwo(MouseEvent e) {
		try {
			root = FXMLLoader.load(getClass().getResource("/application/DetailesPages/MewtoDetails.fxml"));
			stage = (Stage)((Node)e.getSource()).getScene().getWindow();
			scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
	
	public void switchToDetailsMew(MouseEvent e) {
		try {
			root = FXMLLoader.load(getClass().getResource("/application/DetailesPages/MewDetails.fxml"));
			stage = (Stage)((Node)e.getSource()).getScene().getWindow();
			scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
	
}
