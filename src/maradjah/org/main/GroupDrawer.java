package maradjah.org.main;

import java.util.ArrayList;
import java.util.Random;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.List;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.wb.swt.SWTResourceManager;

public class GroupDrawer {

	protected Shell shlWorldCup;

	public List pot1;
	public List pot2;
	public List pot3;
	public List pot4;

	public List groupA;
	public List groupB;
	public List groupC;
	public List groupD;
	public List groupE;
	public List groupF;
	public List groupG;
	public List groupH;

	private List scoreA;
	private List scoreB;
	private List scoreC;
	private List scoreD;
	private List scoreE;
	private List scoreF;
	private List scoreG;
	private List scoreH;

	public Label lblTeamName;
	public List lstScoreBoard;

	public ArrayList<List> scoreLists = new ArrayList<List>();

	public List potsList[] = { pot1, pot2, pot3, pot4 };

	public ArrayList<List> groupsList = new ArrayList<List>();

	public String pot1Items[] = { "Russia", "Germany", "Brazil", "Portugal", "Argentina", "Belgium", "Poland",
			"France" };
	public String pot2Items[] = { "Spain", "Peru", "Switerland", "England", "Colombia", "Mexico", "Uruguay",
			"Croatia" };
	public String pot3Items[] = { "Denmark", "Iceland", "Costa Rica", "Sweden", "Tunisia", "Egypt", "Senegal", "Iran" };
	public String pot4Items[] = { "Serbia", "Nigeria", "Australia", "Japan", "Morocco", "Panama", "South Korea",
			"Saudi Arabia" };

	public java.util.ArrayList<Team> teamPot1 = new ArrayList<Team>();
	public java.util.ArrayList<Team> teamPot2 = new ArrayList<Team>();
	public java.util.ArrayList<Team> teamPot3 = new ArrayList<Team>();
	public java.util.ArrayList<Team> teamPot4 = new ArrayList<Team>();

	public java.util.ArrayList<Team> groupAList = new ArrayList<Team>();
	public java.util.ArrayList<Team> groupBList = new ArrayList<Team>();
	public java.util.ArrayList<Team> groupCList = new ArrayList<Team>();
	public java.util.ArrayList<Team> groupDList = new ArrayList<Team>();
	public java.util.ArrayList<Team> groupEList = new ArrayList<Team>();
	public java.util.ArrayList<Team> groupFList = new ArrayList<Team>();
	public java.util.ArrayList<Team> groupGList = new ArrayList<Team>();
	public java.util.ArrayList<Team> groupHList = new ArrayList<Team>();

	public java.util.ArrayList<ArrayList<Team>> groupXLists = new ArrayList<ArrayList<Team>>();
	public java.util.ArrayList<ArrayList<Team>> groupXListsTemp;

	// 2 teams each
	public java.util.ArrayList<Team> GroupAQualified = new ArrayList<Team>();
	public java.util.ArrayList<Team> GroupBQualified = new ArrayList<Team>();
	public java.util.ArrayList<Team> GroupCQualified = new ArrayList<Team>();
	public java.util.ArrayList<Team> GroupDQualified = new ArrayList<Team>();
	public java.util.ArrayList<Team> GroupEQualified = new ArrayList<Team>();
	public java.util.ArrayList<Team> GroupFQualified = new ArrayList<Team>();
	public java.util.ArrayList<Team> GroupGQualified = new ArrayList<Team>();
	public java.util.ArrayList<Team> GroupHQualified = new ArrayList<Team>();

	public java.util.ArrayList<Team> SixteenABQualified = new ArrayList<Team>();
	public java.util.ArrayList<Team> SixteenCDQualified = new ArrayList<Team>();
	public java.util.ArrayList<Team> SixteenEFQualified = new ArrayList<Team>();
	public java.util.ArrayList<Team> SixteenGHQualified = new ArrayList<Team>();

	public java.util.ArrayList<ArrayList<Team>> groupXQualified = new ArrayList<ArrayList<Team>>();
	public java.util.ArrayList<ArrayList<Team>> SixteenXQualified = new ArrayList<ArrayList<Team>>();

	public Button btnDraw;
	public Button btnClear;
	public Button btnSimulate;
	public Text OneA;
	public Text TwoB;
	public Text OneC;
	public Text TwoD;
	public Text OneE;
	public Text TwoF;
	public Text OneG;
	public Text TwoH;
	public Text OneB;
	public Text TwoA;
	public Text OneD;
	public Text TwoC;
	public Text OneF;
	public Text TwoE;
	public Text OneH;
	public Text TwoG;
	public Text OneATwoB;
	public Text OneCTwoD;
	public Text OneETwoF;
	public Text OneGTwoH;
	public Text OneBTwoA;
	public Text OneDTwoC;
	public Text OneFTwoE;
	public Text OneHTwoG;
	public Text OneATwoD;
	public Text OneETwoH;
	public Text OneBTwoC;
	public Text OneFTwoG;
	public Text OneATwoH;
	public Text OneBTwoG;
	public Text OneATwoG;

	public Group grpSimulation;
	private Group grpGroups;
	private Label lblCoach;
	private Label lblCreationDate;
	private Label lblTeamCoach;
	private Label lblDate;
	private Label lbl1, lbl2, lbl3;

	/**
	 * Launch the application.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			GroupDrawer window = new GroupDrawer();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shlWorldCup.open();
		shlWorldCup.layout();
		addTeamsToPots();
		

		grpSimulation = new Group(shlWorldCup, SWT.NONE);
		grpSimulation.setFont(SWTResourceManager.getFont("Segoe UI", 10, SWT.BOLD));
		grpSimulation.setForeground(SWTResourceManager.getColor(SWT.COLOR_RED));
		grpSimulation.setEnabled(false);
		grpSimulation.setText("Simulation");
		grpSimulation.setBounds(30, 421, 699, 312);
		grpSimulation.setVisible(false);

		OneA = new Text(grpSimulation, SWT.CENTER | SWT.BORDER);
		OneA.setBackground(SWTResourceManager.getColor(245, 222, 179));
		OneA.setBounds(20, 22, 76, 21);

		TwoB = new Text(grpSimulation, SWT.CENTER | SWT.BORDER);
		TwoB.setBackground(SWTResourceManager.getColor(245, 222, 179));
		TwoB.setBounds(20, 59, 76, 21);

		OneC = new Text(grpSimulation, SWT.CENTER | SWT.BORDER);
		OneC.setBackground(SWTResourceManager.getColor(245, 222, 179));
		OneC.setBounds(20, 96, 76, 21);

		TwoD = new Text(grpSimulation, SWT.CENTER | SWT.BORDER);
		TwoD.setBackground(SWTResourceManager.getColor(245, 222, 179));
		TwoD.setBounds(20, 133, 76, 21);

		OneE = new Text(grpSimulation, SWT.CENTER | SWT.BORDER);
		OneE.setBackground(SWTResourceManager.getColor(245, 222, 179));
		OneE.setBounds(20, 170, 76, 21);

		TwoF = new Text(grpSimulation, SWT.CENTER | SWT.BORDER);
		TwoF.setBackground(SWTResourceManager.getColor(245, 222, 179));
		TwoF.setBounds(20, 207, 76, 21);

		OneG = new Text(grpSimulation, SWT.CENTER | SWT.BORDER);
		OneG.setBackground(SWTResourceManager.getColor(245, 222, 179));
		OneG.setBounds(20, 244, 76, 21);

		TwoH = new Text(grpSimulation, SWT.CENTER | SWT.BORDER);
		TwoH.setBackground(SWTResourceManager.getColor(245, 222, 179));
		TwoH.setBounds(20, 281, 76, 21);

		OneB = new Text(grpSimulation, SWT.CENTER | SWT.BORDER);
		OneB.setBackground(SWTResourceManager.getColor(245, 222, 179));
		OneB.setBounds(601, 22, 76, 21);

		TwoA = new Text(grpSimulation, SWT.CENTER | SWT.BORDER);
		TwoA.setBackground(SWTResourceManager.getColor(245, 222, 179));
		TwoA.setBounds(601, 59, 76, 21);

		OneD = new Text(grpSimulation, SWT.CENTER | SWT.BORDER);
		OneD.setBackground(SWTResourceManager.getColor(245, 222, 179));
		OneD.setBounds(601, 96, 76, 21);

		TwoC = new Text(grpSimulation, SWT.CENTER | SWT.BORDER);
		TwoC.setBackground(SWTResourceManager.getColor(245, 222, 179));
		TwoC.setBounds(601, 133, 76, 21);

		OneF = new Text(grpSimulation, SWT.CENTER | SWT.BORDER);
		OneF.setBackground(SWTResourceManager.getColor(245, 222, 179));
		OneF.setBounds(601, 170, 76, 21);

		TwoE = new Text(grpSimulation, SWT.CENTER | SWT.BORDER);
		TwoE.setBackground(SWTResourceManager.getColor(245, 222, 179));
		TwoE.setBounds(601, 207, 76, 21);

		OneH = new Text(grpSimulation, SWT.CENTER | SWT.BORDER);
		OneH.setBackground(SWTResourceManager.getColor(245, 222, 179));
		OneH.setBounds(601, 244, 76, 21);

		TwoG = new Text(grpSimulation, SWT.CENTER | SWT.BORDER);
		TwoG.setBackground(SWTResourceManager.getColor(245, 222, 179));
		TwoG.setBounds(601, 281, 76, 21);

		OneATwoB = new Text(grpSimulation, SWT.CENTER | SWT.BORDER);
		OneATwoB.setBackground(SWTResourceManager.getColor(102, 205, 170));
		OneATwoB.setBounds(128, 46, 76, 21);

		OneCTwoD = new Text(grpSimulation, SWT.CENTER | SWT.BORDER);
		OneCTwoD.setBackground(SWTResourceManager.getColor(102, 205, 170));
		OneCTwoD.setBounds(128, 117, 76, 21);

		OneETwoF = new Text(grpSimulation, SWT.CENTER | SWT.BORDER);
		OneETwoF.setBackground(SWTResourceManager.getColor(102, 205, 170));
		OneETwoF.setBounds(128, 186, 76, 21);

		OneGTwoH = new Text(grpSimulation, SWT.CENTER | SWT.BORDER);
		OneGTwoH.setBackground(SWTResourceManager.getColor(102, 205, 170));
		OneGTwoH.setBounds(128, 256, 76, 21);

		OneBTwoA = new Text(grpSimulation, SWT.CENTER | SWT.BORDER);
		OneBTwoA.setBackground(SWTResourceManager.getColor(102, 205, 170));
		OneBTwoA.setBounds(494, 46, 76, 21);

		OneDTwoC = new Text(grpSimulation, SWT.CENTER | SWT.BORDER);
		OneDTwoC.setBackground(SWTResourceManager.getColor(102, 205, 170));
		OneDTwoC.setBounds(494, 117, 76, 21);

		OneFTwoE = new Text(grpSimulation, SWT.CENTER | SWT.BORDER);
		OneFTwoE.setBackground(SWTResourceManager.getColor(102, 205, 170));
		OneFTwoE.setBounds(494, 186, 76, 21);

		OneHTwoG = new Text(grpSimulation, SWT.CENTER | SWT.BORDER);
		OneHTwoG.setBackground(SWTResourceManager.getColor(102, 205, 170));
		OneHTwoG.setBounds(494, 256, 76, 21);

		OneATwoD = new Text(grpSimulation, SWT.CENTER | SWT.BORDER);
		OneATwoD.setForeground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		OneATwoD.setBackground(SWTResourceManager.getColor(65, 105, 225));
		OneATwoD.setBounds(222, 79, 76, 21);

		OneETwoH = new Text(grpSimulation, SWT.CENTER | SWT.BORDER);
		OneETwoH.setForeground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		OneETwoH.setBackground(SWTResourceManager.getColor(65, 105, 225));
		OneETwoH.setBounds(222, 225, 76, 21);

		OneBTwoC = new Text(grpSimulation, SWT.CENTER | SWT.BORDER);
		OneBTwoC.setForeground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		OneBTwoC.setBackground(SWTResourceManager.getColor(65, 105, 225));
		OneBTwoC.setBounds(395, 79, 76, 21);

		OneFTwoG = new Text(grpSimulation, SWT.CENTER | SWT.BORDER);
		OneFTwoG.setForeground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		OneFTwoG.setBackground(SWTResourceManager.getColor(65, 105, 225));
		OneFTwoG.setBounds(395, 225, 76, 21);

		OneATwoH = new Text(grpSimulation, SWT.CENTER | SWT.BORDER);
		OneATwoH.setBackground(SWTResourceManager.getColor(250, 128, 114));
		OneATwoH.setBounds(265, 151, 76, 21);

		OneBTwoG = new Text(grpSimulation, SWT.CENTER | SWT.BORDER);
		OneBTwoG.setBackground(SWTResourceManager.getColor(250, 128, 114));
		OneBTwoG.setBounds(355, 151, 76, 21);

		OneATwoG = new Text(grpSimulation, SWT.CENTER | SWT.BORDER);
		OneATwoG.setForeground(SWTResourceManager.getColor(SWT.COLOR_BLACK));
		OneATwoG.setBackground(SWTResourceManager.getColor(255, 0, 0));
		OneATwoG.setBounds(306, 269, 76, 21);

		Label lblWinner = new Label(grpSimulation, SWT.NONE);
		lblWinner.setForeground(SWTResourceManager.getColor(SWT.COLOR_RED));
		lblWinner.setAlignment(SWT.CENTER);
		lblWinner.setBounds(316, 250, 55, 15);
		lblWinner.setText("Winner");

		Group grpMachScores = new Group(shlWorldCup, SWT.NONE);
		grpMachScores.setText("Team Games");
		grpMachScores.setBounds(519, 10, 210, 405);

		lstScoreBoard = new List(grpMachScores, SWT.BORDER);
		lstScoreBoard.setBounds(29, 21, 157, 267);

		lblTeamName = new Label(grpMachScores, SWT.NONE);
		lblTeamName.setBounds(80, 294, 78, 15);
		lblTeamName.setFont(SWTResourceManager.getFont("Segoe UI", 9, SWT.BOLD));
		lblTeamName.setForeground(SWTResourceManager.getColor(SWT.COLOR_BLUE));
		lblTeamName.setText("New Label");

		lblCoach = new Label(grpMachScores, SWT.NONE);
		lblCoach.setText("Coach :");
		lblCoach.setForeground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_FOREGROUND));
		lblCoach.setFont(SWTResourceManager.getFont("Segoe UI", 9, SWT.BOLD));
		lblCoach.setBounds(10, 323, 46, 15);

		lblCreationDate = new Label(grpMachScores, SWT.NONE);
		lblCreationDate.setText("Creation Date :");
		lblCreationDate.setForeground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_FOREGROUND));
		lblCreationDate.setFont(SWTResourceManager.getFont("Segoe UI", 9, SWT.BOLD));
		lblCreationDate.setBounds(10, 357, 91, 15);

		lblTeamCoach = new Label(grpMachScores, SWT.NONE);
		lblTeamCoach.setForeground(SWTResourceManager.getColor(SWT.COLOR_DARK_GREEN));
		lblTeamCoach.setFont(SWTResourceManager.getFont("Segoe UI", 9, SWT.BOLD));
		lblTeamCoach.setBounds(55, 323, 135, 15);

		lblDate = new Label(grpMachScores, SWT.NONE);
		lblDate.setForeground(SWTResourceManager.getColor(SWT.COLOR_DARK_GREEN));
		lblDate.setFont(SWTResourceManager.getFont("Segoe UI", 9, SWT.BOLD));
		lblDate.setBounds(100, 357, 93, 15);

		lblTeamName.setVisible(false);
		lblCoach.setVisible(false);
		lblTeamCoach.setVisible(false);
		lblDate.setVisible(false);
		lblCreationDate.setVisible(false);

		Group grpWorldCupPots = new Group(shlWorldCup, SWT.NONE);
		grpWorldCupPots.setText("World Cup Pots");
		grpWorldCupPots.setBounds(35, 10, 478, 180);
		pot1 = new List(grpWorldCupPots, SWT.BORDER);
		pot1.setBounds(31, 21, 76, 133);

		Label lblNewLabel = new Label(grpWorldCupPots, SWT.NONE);
		lblNewLabel.setBounds(56, 160, 55, 15);
		lblNewLabel.setFont(SWTResourceManager.getFont("Segoe UI", 9, SWT.BOLD));
		lblNewLabel.setForeground(SWTResourceManager.getColor(SWT.COLOR_DARK_GREEN));
		lblNewLabel.setText("Pot 1");
		pot1.setItems(pot1Items);

		pot2 = new List(grpWorldCupPots, SWT.BORDER);
		pot2.setBounds(147, 21, 76, 133);
		Label lblNewLabel_1 = new Label(grpWorldCupPots, SWT.NONE);
		lblNewLabel_1.setBounds(173, 160, 55, 15);
		lblNewLabel_1.setFont(SWTResourceManager.getFont("Segoe UI", 9, SWT.BOLD));
		lblNewLabel_1.setForeground(SWTResourceManager.getColor(SWT.COLOR_DARK_GREEN));
		lblNewLabel_1.setText("Pot 2");
		pot2.setItems(pot2Items);

		pot3 = new List(grpWorldCupPots, SWT.BORDER);
		pot3.setBounds(253, 21, 77, 133);
		Label lblNewLabel_2 = new Label(grpWorldCupPots, SWT.NONE);
		lblNewLabel_2.setBounds(279, 160, 55, 15);
		lblNewLabel_2.setFont(SWTResourceManager.getFont("Segoe UI", 9, SWT.BOLD));
		lblNewLabel_2.setForeground(SWTResourceManager.getColor(SWT.COLOR_DARK_GREEN));
		lblNewLabel_2.setText("Pot 3");
		pot3.setItems(pot3Items);

		pot4 = new List(grpWorldCupPots, SWT.BORDER);
		pot4.setBounds(358, 21, 78, 133);

		Label lblNewLabel_3 = new Label(grpWorldCupPots, SWT.NONE);
		lblNewLabel_3.setBounds(384, 160, 55, 15);
		lblNewLabel_3.setFont(SWTResourceManager.getFont("Segoe UI", 9, SWT.BOLD));
		lblNewLabel_3.setForeground(SWTResourceManager.getColor(SWT.COLOR_DARK_GREEN));
		lblNewLabel_3.setText("Pot 4");
		pot4.setItems(pot4Items);

		grpGroups = new Group(shlWorldCup, SWT.NONE);
		grpGroups.setText("Groups");
		grpGroups.setBounds(34, 196, 478, 219);

		groupA = new List(grpGroups, SWT.BORDER);
		groupA.setBounds(10, 31, 71, 77);
		groupsList.add(groupA);

		scoreA = new List(grpGroups, SWT.BORDER);
		scoreA.setBounds(79, 31, 19, 77);
		scoreA.setFont(SWTResourceManager.getFont("Segoe UI", 9, SWT.BOLD));
		scoreA.setForeground(SWTResourceManager.getColor(SWT.COLOR_RED));
		scoreA.setBackground(SWTResourceManager.getColor(153, 204, 255));
		scoreA.setVisible(false);
		groupB = new List(grpGroups, SWT.BORDER);
		groupB.setBounds(104, 31, 71, 77);
		groupsList.add(groupB);

		scoreB = new List(grpGroups, SWT.BORDER);
		scoreB.setBounds(173, 31, 19, 77);
		scoreB.setFont(SWTResourceManager.getFont("Segoe UI", 9, SWT.BOLD));
		scoreB.setForeground(SWTResourceManager.getColor(SWT.COLOR_RED));
		scoreB.setBackground(SWTResourceManager.getColor(153, 204, 255));
		scoreB.setVisible(false);

		Label lblNewLabel_4 = new Label(grpGroups, SWT.NONE);
		lblNewLabel_4.setBounds(20, 15, 55, 15);
		lblNewLabel_4.setForeground(SWTResourceManager.getColor(SWT.COLOR_DARK_MAGENTA));
		lblNewLabel_4.setAlignment(SWT.CENTER);
		lblNewLabel_4.setText("A");

		Label lblNewLabel_5 = new Label(grpGroups, SWT.NONE);
		lblNewLabel_5.setBounds(110, 15, 55, 15);
		lblNewLabel_5.setForeground(SWTResourceManager.getColor(SWT.COLOR_DARK_MAGENTA));
		lblNewLabel_5.setAlignment(SWT.CENTER);
		lblNewLabel_5.setText("B");

		Label lblNewLabel_6 = new Label(grpGroups, SWT.NONE);
		lblNewLabel_6.setBounds(205, 15, 55, 15);
		lblNewLabel_6.setForeground(SWTResourceManager.getColor(SWT.COLOR_DARK_MAGENTA));
		lblNewLabel_6.setAlignment(SWT.CENTER);
		lblNewLabel_6.setText("C");
		groupC = new List(grpGroups, SWT.BORDER);
		groupC.setBounds(198, 31, 71, 77);
		groupsList.add(groupC);

		scoreC = new List(grpGroups, SWT.BORDER);
		scoreC.setBounds(267, 31, 19, 77);
		scoreC.setFont(SWTResourceManager.getFont("Segoe UI", 9, SWT.BOLD));
		scoreC.setForeground(SWTResourceManager.getColor(SWT.COLOR_RED));
		scoreC.setBackground(SWTResourceManager.getColor(153, 204, 255));
		scoreC.setVisible(false);

		Label lblNewLabel_7 = new Label(grpGroups, SWT.NONE);
		lblNewLabel_7.setBounds(300, 15, 55, 15);
		lblNewLabel_7.setForeground(SWTResourceManager.getColor(SWT.COLOR_DARK_MAGENTA));
		lblNewLabel_7.setAlignment(SWT.CENTER);
		lblNewLabel_7.setText("D");
		groupD = new List(grpGroups, SWT.BORDER);
		groupD.setBounds(292, 31, 71, 77);
		groupsList.add(groupD);

		scoreD = new List(grpGroups, SWT.BORDER);
		scoreD.setBounds(361, 31, 19, 77);
		scoreD.setFont(SWTResourceManager.getFont("Segoe UI", 9, SWT.BOLD));
		scoreD.setForeground(SWTResourceManager.getColor(SWT.COLOR_RED));
		scoreD.setBackground(SWTResourceManager.getColor(153, 204, 255));
		scoreD.setVisible(false);
		groupE = new List(grpGroups, SWT.BORDER);
		groupE.setBounds(10, 135, 71, 77);
		groupsList.add(groupE);

		scoreE = new List(grpGroups, SWT.BORDER);
		scoreE.setBounds(79, 135, 19, 77);
		scoreE.setFont(SWTResourceManager.getFont("Segoe UI", 9, SWT.BOLD));
		scoreE.setForeground(SWTResourceManager.getColor(SWT.COLOR_RED));
		scoreE.setBackground(SWTResourceManager.getColor(153, 204, 255));
		scoreE.setVisible(false);
		groupF = new List(grpGroups, SWT.BORDER);
		groupF.setBounds(104, 135, 71, 77);
		groupsList.add(groupF);

		scoreF = new List(grpGroups, SWT.BORDER);
		scoreF.setBounds(172, 135, 19, 77);
		scoreF.setFont(SWTResourceManager.getFont("Segoe UI", 9, SWT.BOLD));
		scoreF.setForeground(SWTResourceManager.getColor(SWT.COLOR_RED));
		scoreF.setBackground(SWTResourceManager.getColor(153, 204, 255));
		scoreF.setVisible(false);

		Label lblNewLabel_8 = new Label(grpGroups, SWT.NONE);
		lblNewLabel_8.setBounds(20, 114, 55, 15);
		lblNewLabel_8.setForeground(SWTResourceManager.getColor(SWT.COLOR_DARK_MAGENTA));
		lblNewLabel_8.setAlignment(SWT.CENTER);
		lblNewLabel_8.setText("E");

		Label lblNewLabel_9 = new Label(grpGroups, SWT.NONE);
		lblNewLabel_9.setBounds(110, 114, 55, 15);
		lblNewLabel_9.setForeground(SWTResourceManager.getColor(SWT.COLOR_DARK_MAGENTA));
		lblNewLabel_9.setAlignment(SWT.CENTER);
		lblNewLabel_9.setText("F");
		groupG = new List(grpGroups, SWT.BORDER);
		groupG.setBounds(198, 135, 71, 77);
		groupsList.add(groupG);

		Label lblNewLabel_10 = new Label(grpGroups, SWT.NONE);
		lblNewLabel_10.setBounds(205, 114, 55, 15);
		lblNewLabel_10.setForeground(SWTResourceManager.getColor(SWT.COLOR_DARK_MAGENTA));
		lblNewLabel_10.setAlignment(SWT.CENTER);
		lblNewLabel_10.setText("G");

		Label lblNewLabel_11 = new Label(grpGroups, SWT.NONE);
		lblNewLabel_11.setBounds(300, 114, 55, 15);
		lblNewLabel_11.setForeground(SWTResourceManager.getColor(SWT.COLOR_DARK_MAGENTA));
		lblNewLabel_11.setAlignment(SWT.CENTER);
		lblNewLabel_11.setText("H");
		groupH = new List(grpGroups, SWT.BORDER);
		groupH.setBounds(292, 135, 71, 77);
		groupsList.add(groupH);

		scoreG = new List(grpGroups, SWT.BORDER);
		scoreG.setBounds(267, 135, 19, 77);
		scoreG.setFont(SWTResourceManager.getFont("Segoe UI", 9, SWT.BOLD));
		scoreG.setForeground(SWTResourceManager.getColor(SWT.COLOR_RED));
		scoreG.setBackground(SWTResourceManager.getColor(153, 204, 255));
		scoreG.setVisible(false);

		scoreH = new List(grpGroups, SWT.BORDER);
		scoreH.setBounds(361, 135, 19, 77);
		scoreH.setFont(SWTResourceManager.getFont("Segoe UI", 9, SWT.BOLD));
		scoreH.setForeground(SWTResourceManager.getColor(SWT.COLOR_RED));
		scoreH.setBackground(SWTResourceManager.getColor(153, 204, 255));
		scoreH.setVisible(false);

		btnDraw = new Button(grpGroups, SWT.NONE);
		btnDraw.setBounds(386, 30, 88, 25);
		btnDraw.addSelectionListener(new SelectionAdapter() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				emptyGroups();
				if (teamPot2.size() == 0) {
					addTeamsToPots();
				}
				lstScoreBoard.removeAll();
				lblTeamName.setText("");
				fillGroupeXLists();
				drawTeams();
				btnSimulate.setEnabled(true);
				btnClear.setEnabled(true);
				lbl1.setVisible(false);
				lbl2.setVisible(false);
				lbl3.setVisible(false);

				for (int i = 0; i < 8; i++)
					for (int j = 0; j < 4; j++) {
						groupXListsTemp.get(i).get(j).setGroupeScore(0);
						groupXListsTemp.get(i).get(j).setGamesScore(new ArrayList<String>());
					}
			}
		});
		btnDraw.setFont(SWTResourceManager.getFont("Segoe UI", 9, SWT.BOLD));
		btnDraw.setForeground(SWTResourceManager.getColor(SWT.COLOR_BLUE));
		btnDraw.setText("Draw");

		btnClear = new Button(grpGroups, SWT.NONE);
		btnClear.setBounds(386, 73, 88, 25);
		btnClear.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				emptyGroups();
			}
		});
		btnClear.setFont(SWTResourceManager.getFont("Segoe UI", 9, SWT.BOLD));
		btnClear.setForeground(SWTResourceManager.getColor(255, 0, 0));
		btnClear.setText("Clear");
		btnClear.setEnabled(false);

		btnSimulate = new Button(grpGroups, SWT.NONE);
		btnSimulate.setBounds(386, 135, 88, 25);
		btnSimulate.setEnabled(false);
		btnSimulate.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent arg0) {
				simulate();
			}
		});
		btnSimulate.setFont(SWTResourceManager.getFont("Segoe UI", 9, SWT.BOLD));
		btnSimulate.setText("Simulate");

		lbl1 = new Label(grpGroups, SWT.NONE);
		lbl1.setForeground(SWTResourceManager.getColor(SWT.COLOR_RED));
		lbl1.setBounds(394, 166, 82, 15);
		lbl1.setText("Select a team ");

		lbl2 = new Label(grpGroups, SWT.NONE);
		lbl2.setForeground(SWTResourceManager.getColor(SWT.COLOR_RED));
		lbl2.setBounds(409, 178, 55, 15);
		lbl2.setText("to show");

		lbl3 = new Label(grpGroups, SWT.NONE);
		lbl3.setForeground(SWTResourceManager.getColor(SWT.COLOR_RED));
		lbl3.setBounds(394, 190, 82, 15);
		lbl3.setText("match history");
		
		lbl1.setVisible(false);
		lbl2.setVisible(false);
		lbl3.setVisible(false);
		groupH.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetSelected(SelectionEvent arg0) {
				lstScoreBoard.removeAll();
				lblTeamName.setVisible(true);
				lblCoach.setVisible(true);
				lblTeamCoach.setVisible(true);
				lblDate.setVisible(true);
				lblCreationDate.setVisible(true);
				for (int i = 0; i < groupsList.size(); i++) {
					if (i != 7)
						groupsList.get(i).deselectAll();
				}
				String selected[] = groupH.getSelection();
				for (int i = 0; i < selected.length; i++) {
					for (Team t : groupXListsTemp.get(7)) {
						if (t.getName().equals(selected[i])) {
							lblTeamName.setText(t.getName());
							lblTeamCoach.setText(t.getCoach());
							lblDate.setText(t.getCreationDate());
							lstScoreBoard.add("            Group Stage");
							for (int j = 0; j < t.getGamesScore().size(); j++) {
								if (j == 3)
									lstScoreBoard.add("                 1/8");
								if (j == 4)
									lstScoreBoard.add("                 1/4");
								if (j == 5)
									lstScoreBoard.add("            Semi-Finals");
								if (j == 6)
									lstScoreBoard.add("               Finals");
								lstScoreBoard.add(t.getGamesScore().get(j));
							}
						}
						// something here
					}
				}

			}

			@Override
			public void widgetDefaultSelected(SelectionEvent arg0) {

			}
		});
		groupG.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetSelected(SelectionEvent arg0) {
				lstScoreBoard.removeAll();
				lblTeamName.setVisible(true);
				lblCoach.setVisible(true);
				lblTeamCoach.setVisible(true);
				lblDate.setVisible(true);
				lblCreationDate.setVisible(true);
				for (int i = 0; i < groupsList.size(); i++) {
					if (i != 6)
						groupsList.get(i).deselectAll();
				}
				String selected[] = groupG.getSelection();
				for (int i = 0; i < selected.length; i++) {
					for (Team t : groupXListsTemp.get(6)) {
						if (t.getName().equals(selected[i])) {
							lblTeamName.setText(t.getName());
							lblTeamCoach.setText(t.getCoach());
							lblDate.setText(t.getCreationDate());
							lstScoreBoard.add("            Group Stage");
							for (int j = 0; j < t.getGamesScore().size(); j++) {
								if (j == 3)
									lstScoreBoard.add("                 1/8");
								if (j == 4)
									lstScoreBoard.add("                 1/4");
								if (j == 5)
									lstScoreBoard.add("            Semi-Finals");
								if (j == 6)
									lstScoreBoard.add("               Finals");
								lstScoreBoard.add(t.getGamesScore().get(j));
							}
						}
						// something here
					}
				}

			}

			@Override
			public void widgetDefaultSelected(SelectionEvent arg0) {
				// TODO Auto-generated method stub

			}
		});
		groupF.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetSelected(SelectionEvent arg0) {
				lstScoreBoard.removeAll();
				lblTeamName.setVisible(true);
				lblCoach.setVisible(true);
				lblTeamCoach.setVisible(true);
				lblDate.setVisible(true);
				lblCreationDate.setVisible(true);
				lblTeamName.setText("");
				lblTeamCoach.setText("");
				lblDate.setText("");
				for (int i = 0; i < groupsList.size(); i++) {
					if (i != 5)
						groupsList.get(i).deselectAll();
				}
				String selected[] = groupF.getSelection();
				for (int i = 0; i < selected.length; i++) {
					for (Team t : groupXListsTemp.get(5)) {
						if (t.getName().equals(selected[i])) {
							lblTeamName.setText(t.getName());
							lblTeamCoach.setText(t.getCoach());
							lblDate.setText(t.getCreationDate());
							lstScoreBoard.add("            Group Stage");
							for (int j = 0; j < t.getGamesScore().size(); j++) {
								if (j == 3)
									lstScoreBoard.add("                 1/8");
								if (j == 4)
									lstScoreBoard.add("                 1/4");
								if (j == 5)
									lstScoreBoard.add("            Semi-Finals");
								if (j == 6)
									lstScoreBoard.add("               Finals");
								lstScoreBoard.add(t.getGamesScore().get(j));
							}
						}
						// something here
					}
				}

			}

			@Override
			public void widgetDefaultSelected(SelectionEvent arg0) {
				// TODO Auto-generated method stub

			}
		});
		groupE.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetSelected(SelectionEvent arg0) {
				lstScoreBoard.removeAll();
				lblTeamName.setVisible(true);
				lblCoach.setVisible(true);
				lblTeamCoach.setVisible(true);
				lblDate.setVisible(true);
				lblCreationDate.setVisible(true);
				for (int i = 0; i < groupsList.size(); i++) {
					if (i != 4)
						groupsList.get(i).deselectAll();
				}
				String selected[] = groupE.getSelection();
				for (int i = 0; i < selected.length; i++) {
					for (Team t : groupXListsTemp.get(4)) {
						if (t.getName().equals(selected[i])) {
							lblTeamName.setText(t.getName());
							lblTeamCoach.setText(t.getCoach());
							lblDate.setText(t.getCreationDate());
							lstScoreBoard.add("            Group Stage");
							for (int j = 0; j < t.getGamesScore().size(); j++) {
								if (j == 3)
									lstScoreBoard.add("                 1/8");
								if (j == 4)
									lstScoreBoard.add("                 1/4");
								if (j == 5)
									lstScoreBoard.add("            Semi-Finals");
								if (j == 6)
									lstScoreBoard.add("               Finals");
								lstScoreBoard.add(t.getGamesScore().get(j));
							}
						}
						// something here
					}
				}

			}

			@Override
			public void widgetDefaultSelected(SelectionEvent arg0) {
				// TODO Auto-generated method stub

			}
		});
		groupD.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetSelected(SelectionEvent arg0) {
				lstScoreBoard.removeAll();
				lblTeamName.setVisible(true);
				lblCoach.setVisible(true);
				lblTeamCoach.setVisible(true);
				lblDate.setVisible(true);
				lblCreationDate.setVisible(true);
				for (int i = 0; i < groupsList.size(); i++) {
					if (i != 3)
						groupsList.get(i).deselectAll();
				}
				String selected[] = groupD.getSelection();
				for (int i = 0; i < selected.length; i++) {
					for (Team t : groupXListsTemp.get(3)) {
						if (t.getName().equals(selected[i])) {
							lblTeamName.setText(t.getName());
							lblTeamCoach.setText(t.getCoach());
							lblDate.setText(t.getCreationDate());
							lstScoreBoard.add("            Group Stage");
							for (int j = 0; j < t.getGamesScore().size(); j++) {
								if (j == 3)
									lstScoreBoard.add("                 1/8");
								if (j == 4)
									lstScoreBoard.add("                 1/4");
								if (j == 5)
									lstScoreBoard.add("            Semi-Finals");
								if (j == 6)
									lstScoreBoard.add("               Finals");
								lstScoreBoard.add(t.getGamesScore().get(j));
							}
						}
						// something here
					}
				}

			}

			@Override
			public void widgetDefaultSelected(SelectionEvent arg0) {
				// TODO Auto-generated method stub

			}
		});
		groupC.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetSelected(SelectionEvent arg0) {
				lstScoreBoard.removeAll();
				lblTeamName.setVisible(true);
				lblCoach.setVisible(true);
				lblTeamCoach.setVisible(true);
				lblDate.setVisible(true);
				lblCreationDate.setVisible(true);
				lblTeamName.setText("");
				lblTeamCoach.setText("");
				lblDate.setText("");
				for (int i = 0; i < groupsList.size(); i++) {
					if (i != 2)
						groupsList.get(i).deselectAll();
				}
				String selected[] = groupC.getSelection();
				for (int i = 0; i < selected.length; i++) {
					for (Team t : groupXListsTemp.get(2)) {
						// System.out.println(t.getName());
						// System.out.println(selected[i]);
						if (t.getName().equals(selected[i])) {
							lblTeamName.setText(t.getName());
							lblTeamCoach.setText(t.getCoach());
							lblDate.setText(t.getCreationDate());
							lstScoreBoard.add("            Group Stage");
							for (int j = 0; j < t.getGamesScore().size(); j++) {
								if (j == 3)
									lstScoreBoard.add("                 1/8");
								if (j == 4)
									lstScoreBoard.add("                 1/4");
								if (j == 5)
									lstScoreBoard.add("            Semi-Finals");
								if (j == 6)
									lstScoreBoard.add("               Finals");
								lstScoreBoard.add(t.getGamesScore().get(j));
							}
						}
						// something here
					}
				}

			}

			@Override
			public void widgetDefaultSelected(SelectionEvent arg0) {
				// TODO Auto-generated method stub

			}
		});
		groupB.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetSelected(SelectionEvent arg0) {
				lstScoreBoard.removeAll();
				lblTeamName.setVisible(true);
				lblCoach.setVisible(true);
				lblTeamCoach.setVisible(true);
				lblDate.setVisible(true);
				lblCreationDate.setVisible(true);
				for (int i = 0; i < groupsList.size(); i++) {
					if (i != 1)
						groupsList.get(i).deselectAll();
				}
				String selected[] = groupB.getSelection();
				for (int i = 0; i < selected.length; i++) {
					for (Team t : groupXListsTemp.get(1)) {
						if (t.getName().equals(selected[i])) {
							lblTeamName.setText(t.getName());
							lblTeamCoach.setText(t.getCoach());
							lblDate.setText(t.getCreationDate());
							lstScoreBoard.add("            Group Stage");
							for (int j = 0; j < t.getGamesScore().size(); j++) {
								if (j == 3)
									lstScoreBoard.add("                 1/8");
								if (j == 4)
									lstScoreBoard.add("                 1/4");
								if (j == 5)
									lstScoreBoard.add("            Semi-Finals");
								if (j == 6)
									lstScoreBoard.add("               Finals");
								lstScoreBoard.add(t.getGamesScore().get(j));
							}
						}
					}
				}

			}

			@Override
			public void widgetDefaultSelected(SelectionEvent arg0) {
				// TODO Auto-generated method stub

			}
		});
		groupA.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetSelected(SelectionEvent arg0) {
				lstScoreBoard.removeAll();
				lblTeamName.setVisible(true);
				lblCoach.setVisible(true);
				lblTeamCoach.setVisible(true);
				lblDate.setVisible(true);
				lblCreationDate.setVisible(true);
				for (int i = 1; i < groupsList.size(); i++) {
					groupsList.get(i).deselectAll();
				}
				String selected[] = groupA.getSelection();
				for (int i = 0; i < selected.length; i++) {
					for (Team t : groupXListsTemp.get(0)) {
						if (t.getName().equals(selected[i])) {
							lblTeamName.setText(t.getName());
							lblTeamCoach.setText(t.getCoach());
							lblDate.setText(t.getCreationDate());
							lstScoreBoard.add("            Group Stage");
							for (int j = 0; j < t.getGamesScore().size(); j++) {
								if (j == 3)
									lstScoreBoard.add("                 1/8");
								if (j == 4)
									lstScoreBoard.add("                 1/4");
								if (j == 5)
									lstScoreBoard.add("            Semi-Finals");
								if (j == 6)
									lstScoreBoard.add("               Finals");
								lstScoreBoard.add(t.getGamesScore().get(j));
							}
						}
					}
				}

			}

			@Override
			public void widgetDefaultSelected(SelectionEvent arg0) {
				// TODO Auto-generated method stub

			}
		});

		while (!shlWorldCup.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}

	}

	public void addTeamsToPots() {

		Team Russia = new Team("Russia", 563, 0, "Stanislav Tchertchessov", "1912");
		Team Germany = new Team("Germany", 1631, 0, "Joachim Löw", "1908");
		Team Brazil = new Team("Brazil", 1619, 0, "Tite Adenor Leonardo", "1914");
		Team Portugal = new Team("Portugal", 1446, 0, "Fernando Santos", "1921");
		Team Argentina = new Team("Argentina", 1445, 0, "Jorge Sampaoli", "1901");
		Team Belgium = new Team("Belgium", 1333, 0, "Roberto Martínez Montoliú", "1895");
		Team Poland = new Team("Poland", 1323, 0, "Adam Nawałka", "1919");
		Team France = new Team("France", 1226, 0, "Didier Deschamps", "1904");

		teamPot1.add(Russia);
		teamPot1.add(Germany);
		teamPot1.add(Brazil);
		teamPot1.add(Portugal);
		teamPot1.add(Argentina);
		teamPot1.add(Belgium);
		teamPot1.add(Poland);
		teamPot1.add(France);

		Team Spain = new Team("Spain", 1218, 0, "Julen Lopetegui", "1920");
		Team Peru = new Team("Peru", 1160, 0, "Ricardo Gareca", "1922");
		Team Switerland = new Team("Switerland", 1134, 0, "Vladimir Petković", "1895");
		Team England = new Team("England", 1116, 0, "Gareth Southgate", "1872");
		Team Colombia = new Team("Colombia", 1095, 0, "José Pékerman", "1924");
		Team Mexico = new Team("Mexico", 1060, 0, "Juan Carlos Osorio", "1923");
		Team Uruguay = new Team("Uruguay", 1034, 0, "Óscar Tabárez", "1900");
		Team Croatia = new Team("Croatia", 1013, 0, "Zlatko Dalić", "1912");

		teamPot2.add(Spain);
		teamPot2.add(Peru);
		teamPot2.add(Switerland);
		teamPot2.add(England);
		teamPot2.add(Colombia);
		teamPot2.add(Mexico);
		teamPot2.add(Uruguay);
		teamPot2.add(Croatia);

		Team Denmark = new Team("Denmark", 1001, 0, "Åge Hareide", "1900");
		Team Iceland = new Team("Iceland", 920, 0, "Heimir Hallgrímsson", "1930");
		Team Costa_Rica = new Team("Costa Rica", 914, 0, "Oscar Ramírez", "1927");
		Team Sweden = new Team("Sweden", 872, 0, "Janne Andersson", "1904");
		Team Tunisia = new Team("Tunisia", 834, 0, "Nabil Maâloul", "1956");
		Team Egypt = new Team("Egypt", 818, 0, "Héctor Cúper", "1921");
		Team Senegal = new Team("Senegal", 815, 0, "Aliou Cissé", "1960");
		Team Iran = new Team("Iran", 784, 0, "Carlos Queiroz", "1920");

		teamPot3.add(Denmark);
		teamPot3.add(Iceland);
		teamPot3.add(Costa_Rica);
		teamPot3.add(Sweden);
		teamPot3.add(Tunisia);
		teamPot3.add(Egypt);
		teamPot3.add(Senegal);
		teamPot3.add(Iran);

		Team Serbia = new Team("Serbia", 748, 0, "Slavoljub Muslin", "1919");
		Team Nigeria = new Team("Nigeria", 721, 0, "Salisu Yusuf", "1945");
		Team Australia = new Team("Australia", 714, 0, "Ange Postecoglou", "1922");
		Team Japan = new Team("Japan", 711, 0, "Vahid Halilhodžić", "1921");
		Team Morocco = new Team("Morocco", 680, 0, "Hervé Renard", "1955");
		Team Panama = new Team("Panama", 670, 0, "Hernán Darío Gómez", "1937");
		Team South_Korea = new Team("South Korea", 588, 0, "Shin Tae-yong", "1928");
		Team Saudi_Arabia = new Team("Saudi Arabia", 576, 0, "Edgardo Bauza", "1956");

		teamPot4.add(Serbia);
		teamPot4.add(Nigeria);
		teamPot4.add(Australia);
		teamPot4.add(Japan);
		teamPot4.add(Morocco);
		teamPot4.add(Panama);
		teamPot4.add(South_Korea);
		teamPot4.add(Saudi_Arabia);
	}

	public void fillGroupeXLists() {
		groupXLists.add(groupAList);
		groupXLists.add(groupBList);
		groupXLists.add(groupCList);
		groupXLists.add(groupDList);
		groupXLists.add(groupEList);
		groupXLists.add(groupFList);
		groupXLists.add(groupGList);
		groupXLists.add(groupHList);

		groupXQualified.add(GroupAQualified);
		groupXQualified.add(GroupBQualified);
		groupXQualified.add(GroupCQualified);
		groupXQualified.add(GroupDQualified);
		groupXQualified.add(GroupEQualified);
		groupXQualified.add(GroupFQualified);
		groupXQualified.add(GroupGQualified);
		groupXQualified.add(GroupHQualified);

		scoreLists.add(scoreA);
		scoreLists.add(scoreB);
		scoreLists.add(scoreC);
		scoreLists.add(scoreD);
		scoreLists.add(scoreE);
		scoreLists.add(scoreF);
		scoreLists.add(scoreG);
		scoreLists.add(scoreH);
	}

	/**
	 * Draw world cup 2018 teams
	 */
	public void emptyGroups() {
		for (int i = 0; i < groupsList.size(); i++) {
			groupsList.get(i).removeAll();
		}
		for (int i = 0; i < scoreLists.size(); i++) {
			scoreLists.get(i).removeAll();
		}
		for (int i = 0; i < groupXLists.size(); i++) {
			for (int j = 0; j < 4; j++) {

			}
		}
		btnSimulate.setEnabled(false);
		btnClear.setEnabled(false);
		scoreA.setVisible(false);
		scoreB.setVisible(false);
		scoreC.setVisible(false);
		scoreD.setVisible(false);
		scoreE.setVisible(false);
		scoreF.setVisible(false);
		scoreG.setVisible(false);
		scoreH.setVisible(false);
		lblTeamName.setVisible(false);
		lblCoach.setVisible(false);
		lblTeamCoach.setVisible(false);
		lblDate.setVisible(false);
		lblCreationDate.setVisible(false);
		lbl1.setVisible(false);
		lbl2.setVisible(false);
		lbl3.setVisible(false);
		shlWorldCup.setSize(763, 461);
	}

	public void drawTeams() {

		// clear groups in groupXLists
		for (int i = 0; i < groupXLists.size(); i++)
			groupXLists.get(i).clear();

		// add Pot1 countries to Groups
		for (int i = 0; i < 8; i++) {
			groupsList.get(i).add(teamPot1.get(i).getName());
			groupXLists.get(i).add(teamPot1.get(i));
		}

		// randomize pot 2 for each group
		Random rand2 = new Random();
		for (int i = 0; i < 8; i++) {
			final int randomIndex = rand2.nextInt(teamPot2.size());
			groupsList.get(i).add(teamPot2.get(randomIndex).getName());
			groupXLists.get(i).add(teamPot2.get(randomIndex));
			teamPot2.remove(randomIndex);
		}

		// randomize pot 3 for each group
		Random rand3 = new Random();
		for (int i = 0; i < 8; i++) {
			final int randomIndex = rand3.nextInt(teamPot3.size());
			groupsList.get(i).add(teamPot3.get(randomIndex).getName());
			groupXLists.get(i).add(teamPot3.get(randomIndex));
			teamPot3.remove(randomIndex);
		}
		// randomize pot 4 for each group
		Random rand4 = new Random();
		for (int i = 0; i < 8; i++) {
			final int randomIndex = rand4.nextInt(teamPot4.size());
			groupsList.get(i).add(teamPot4.get(randomIndex).getName());
			groupXLists.get(i).add(teamPot4.get(randomIndex));
			teamPot4.remove(randomIndex);
		}

		// save GroupXlists to Temp value before deleting it to use it to simulate
		groupXListsTemp = new ArrayList<ArrayList<Team>>(groupXLists);

		// clear the groupXLists
		groupXLists.clear();

	}

	public void simulate() {
		grpSimulation.setVisible(true);
		shlWorldCup.setSize(763, 790);
		lbl1.setVisible(true);
		lbl2.setVisible(true);
		lbl3.setVisible(true);

		// clear groupXQualified Lists
		for (int i = 0; i < 8; i++) {
			groupXQualified.get(i).clear();
		}
		for (int i = 0; i < scoreLists.size(); i++) {
			scoreLists.get(i).removeAll();
		}
		groupQualifier();

		btnSimulate.setEnabled(false);
		lstScoreBoard.removeAll();
		for (int i = 0; i < 8; i++)
			scoreLists.get(i).setVisible(true);

	}

	public void groupQualifier() {

		// init team scores
		for (int i = 0; i < 8; i++)
			for (int j = 0; j < 4; j++)
				groupXListsTemp.get(i).get(j).setGroupeScore(0);

		// simulate game
		for (int k = 0; k < 8; k++)
			for (int i = 0; i < 3; i++)
				for (int j = i + 1; j < 4; j++) {
					gameResut(groupXListsTemp.get(k).get(i), groupXListsTemp.get(k).get(j), false);
				}

		// fill scoreLists
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 4; j++)
				scoreLists.get(i).add(String.valueOf(groupXListsTemp.get(i).get(j).getGroupeScore()));

		}
		// sort groupXListsTemp
		for (int i = 0; i < 8; i++)
			groupXListsTemp.get(i).sort((Team t1, Team t2) -> t1.getGroupeScore() - t2.getGroupeScore());

		// fill groupXQualified
		for (int i = 0; i < 8; i++)
			for (int j = 3; j >= 2; j--) {
				groupXQualified.get(i).add(groupXListsTemp.get(i).get(j));
			}

		OneA.setText(groupXQualified.get(0).get(0).getName());
		OneB.setText(groupXQualified.get(1).get(0).getName());
		OneC.setText(groupXQualified.get(2).get(0).getName());
		OneD.setText(groupXQualified.get(3).get(0).getName());
		OneE.setText(groupXQualified.get(4).get(0).getName());
		OneF.setText(groupXQualified.get(5).get(0).getName());
		OneG.setText(groupXQualified.get(6).get(0).getName());
		OneH.setText(groupXQualified.get(7).get(0).getName());

		TwoA.setText(groupXQualified.get(0).get(1).getName());
		TwoB.setText(groupXQualified.get(1).get(1).getName());
		TwoC.setText(groupXQualified.get(2).get(1).getName());
		TwoD.setText(groupXQualified.get(3).get(1).getName());
		TwoE.setText(groupXQualified.get(4).get(1).getName());
		TwoF.setText(groupXQualified.get(5).get(1).getName());
		TwoG.setText(groupXQualified.get(6).get(1).getName());
		TwoH.setText(groupXQualified.get(7).get(1).getName());

		// 1/8 round
		Team oneATwoB, oneBTwoA, oneCTwoD, oneDTwoC, oneETwoF, oneFTwoE, oneGTwoH, oneHTwoG;

		oneATwoB = gameResut(groupXQualified.get(0).get(0), groupXQualified.get(1).get(1), true);
		OneATwoB.setText(oneATwoB.getName());
		oneBTwoA = gameResut(groupXQualified.get(1).get(0), groupXQualified.get(0).get(1), true);
		OneBTwoA.setText(oneBTwoA.getName());
		oneCTwoD = gameResut(groupXQualified.get(2).get(0), groupXQualified.get(3).get(1), true);
		OneCTwoD.setText(oneCTwoD.getName());
		oneDTwoC = gameResut(groupXQualified.get(3).get(0), groupXQualified.get(2).get(1), true);
		OneDTwoC.setText(oneDTwoC.getName());
		oneETwoF = gameResut(groupXQualified.get(4).get(0), groupXQualified.get(5).get(1), true);
		OneETwoF.setText(oneETwoF.getName());
		oneFTwoE = gameResut(groupXQualified.get(5).get(0), groupXQualified.get(4).get(1), true);
		OneFTwoE.setText(oneFTwoE.getName());
		oneGTwoH = gameResut(groupXQualified.get(6).get(0), groupXQualified.get(7).get(1), true);
		OneGTwoH.setText(oneGTwoH.getName());
		oneHTwoG = gameResut(groupXQualified.get(7).get(0), groupXQualified.get(6).get(1), true);
		OneHTwoG.setText(oneHTwoG.getName());

		// 1/4 round
		Team oneATwoD, oneETwoH, oneBtwoC, oneFTwoG;
		oneATwoD = gameResut(oneATwoB, oneCTwoD, true);
		OneATwoD.setText(oneATwoD.getName());
		oneETwoH = gameResut(oneETwoF, oneGTwoH, true);
		OneETwoH.setText(oneETwoH.getName());
		oneBtwoC = gameResut(oneBTwoA, oneDTwoC, true);
		OneBTwoC.setText(oneBtwoC.getName());
		oneFTwoG = gameResut(oneFTwoE, oneHTwoG, true);
		OneFTwoG.setText(oneFTwoG.getName());

		// 1/2 round
		Team oneATwoH, oneBTwoG;
		oneATwoH = gameResut(oneATwoD, oneETwoH, true);
		OneATwoH.setText(oneATwoH.getName());
		oneBTwoG = gameResut(oneBtwoC, oneFTwoG, true);
		OneBTwoG.setText(oneBTwoG.getName());

		// final
		Team oneATwoG;
		oneATwoG = gameResut(oneATwoH, oneBTwoG, true);
		OneATwoG.setText(oneATwoG.getName());

	}

	public Team gameResut(Team a, Team b, boolean eliminationGame) {
		Score score = new Score();
		if (!eliminationGame) {
			GameOutput caseOne = new GameOutput();
			GameOutput caseTwo = new GameOutput();
			GameOutput caseThree = new GameOutput();
			GameOutput caseFour = new GameOutput();
			GameOutput caseFive = new GameOutput();
			// 1 : a wins
			// 2 : b wins
			// 3 : draw
			caseOne.addNumber(1, 0.2d);
			caseOne.addNumber(2, 0.1d);
			caseOne.addNumber(3, 0.7d);

			caseTwo.addNumber(1, 0.5d);
			caseTwo.addNumber(2, 0.2d);
			caseTwo.addNumber(3, 0.3d);

			caseThree.addNumber(1, 0.7d);
			caseThree.addNumber(2, 0.15d);
			caseThree.addNumber(3, 0.25d);

			caseFour.addNumber(1, 0.85d);
			caseFour.addNumber(2, 0.1d);
			caseFour.addNumber(3, 0.05d);

			caseFive.addNumber(1, 0.9d);
			caseFive.addNumber(2, 0.05d);
			caseFive.addNumber(3, 0.05d);

			int rate = a.getRate() - b.getRate();
			if (rate < 0) {
				return gameResut(b, a, false);
			}
			if (rate > 0 && rate < 200) {
				switch (caseOne.getDistributedRandomNumber()) {
				case 1:
					score.SimulateScore();
					a.setGroupeScore(a.getGroupeScore() + 3);
					a.getGamesScore().add(
							a.getName() + " " + score.getScoreWon() + " - " + score.getScoreLost() + " " + b.getName());
					b.getGamesScore().add(
							b.getName() + " " + score.getScoreLost() + " - " + score.getScoreWon() + " " + a.getName());
					return a;
				case 2:
					score.SimulateScore();
					b.setGroupeScore(b.getGroupeScore() + 3);
					b.getGamesScore().add(
							b.getName() + " " + score.getScoreWon() + " - " + score.getScoreLost() + " " + a.getName());
					a.getGamesScore().add(
							a.getName() + " " + score.getScoreLost() + " - " + score.getScoreWon() + " " + b.getName());
					return b;
				case 3:
					a.setGroupeScore(a.getGroupeScore() + 1);
					b.setGroupeScore(b.getGroupeScore() + 1);
					String DeuceScore = score.SimulateScoreDeuce();
					a.getGamesScore().add(a.getName() + " " + DeuceScore + " " + b.getName());
					b.getGamesScore().add(b.getName() + " " + DeuceScore + " " + a.getName());

					return a;
				}
			} else if (rate >= 200 && rate < 500) {
				switch (caseTwo.getDistributedRandomNumber()) {
				case 1:
					score.SimulateScore();
					a.setGroupeScore(a.getGroupeScore() + 3);
					a.getGamesScore().add(
							a.getName() + " " + score.getScoreWon() + " - " + score.getScoreLost() + " " + b.getName());
					b.getGamesScore().add(
							b.getName() + " " + score.getScoreLost() + " - " + score.getScoreWon() + " " + a.getName());
					return a;
				case 2:
					score.SimulateScore();
					b.setGroupeScore(b.getGroupeScore() + 3);
					b.getGamesScore().add(
							b.getName() + " " + score.getScoreWon() + " - " + score.getScoreLost() + " " + a.getName());
					a.getGamesScore().add(
							a.getName() + " " + score.getScoreLost() + " - " + score.getScoreWon() + " " + b.getName());
					return b;
				case 3:
					a.setGroupeScore(a.getGroupeScore() + 1);
					b.setGroupeScore(b.getGroupeScore() + 1);
					String DeuceScore = score.SimulateScoreDeuce();
					a.getGamesScore().add(a.getName() + " " + DeuceScore + " " + b.getName());
					b.getGamesScore().add(b.getName() + " " + DeuceScore + " " + a.getName());
					return a;
				}
			} else if (rate >= 500 && rate < 700) {
				switch (caseThree.getDistributedRandomNumber()) {
				case 1:
					score.SimulateScore();
					a.setGroupeScore(a.getGroupeScore() + 3);
					a.getGamesScore().add(
							a.getName() + " " + score.getScoreWon() + " - " + score.getScoreLost() + " " + b.getName());
					b.getGamesScore().add(
							b.getName() + " " + score.getScoreLost() + " - " + score.getScoreWon() + " " + a.getName());
					return a;
				case 2:
					score.SimulateScore();
					b.setGroupeScore(b.getGroupeScore() + 3);
					b.getGamesScore().add(
							b.getName() + " " + score.getScoreWon() + " - " + score.getScoreLost() + " " + a.getName());
					a.getGamesScore().add(
							a.getName() + " " + score.getScoreLost() + " - " + score.getScoreWon() + " " + b.getName());
					return b;
				case 3:
					a.setGroupeScore(a.getGroupeScore() + 1);
					b.setGroupeScore(b.getGroupeScore() + 1);
					String DeuceScore = score.SimulateScoreDeuce();
					a.getGamesScore().add(a.getName() + " " + DeuceScore + " " + b.getName());
					b.getGamesScore().add(b.getName() + " " + DeuceScore + " " + a.getName());
					return a;
				}
			} else if (rate >= 700 && rate < 900) {
				switch (caseFour.getDistributedRandomNumber()) {
				case 1:
					score.SimulateScore();
					a.setGroupeScore(a.getGroupeScore() + 3);
					a.getGamesScore().add(
							a.getName() + " " + score.getScoreWon() + " - " + score.getScoreLost() + " " + b.getName());
					b.getGamesScore().add(
							b.getName() + " " + score.getScoreLost() + " - " + score.getScoreWon() + " " + a.getName());
					return a;
				case 2:
					score.SimulateScore();
					b.setGroupeScore(b.getGroupeScore() + 3);
					b.getGamesScore().add(
							b.getName() + " " + score.getScoreWon() + " - " + score.getScoreLost() + " " + a.getName());
					a.getGamesScore().add(
							a.getName() + " " + score.getScoreLost() + " - " + score.getScoreWon() + " " + b.getName());
					return b;
				case 3:
					a.setGroupeScore(a.getGroupeScore() + 1);
					b.setGroupeScore(b.getGroupeScore() + 1);
					String DeuceScore = score.SimulateScoreDeuce();
					a.getGamesScore().add(a.getName() + " " + DeuceScore + " " + b.getName());
					b.getGamesScore().add(b.getName() + " " + DeuceScore + " " + a.getName());
					return a;
				}
			} else
				switch (caseFive.getDistributedRandomNumber()) {
				case 1:
					score.SimulateScore();
					a.setGroupeScore(a.getGroupeScore() + 3);
					a.getGamesScore().add(
							a.getName() + " " + score.getScoreWon() + " - " + score.getScoreLost() + " " + b.getName());
					b.getGamesScore().add(
							b.getName() + " " + score.getScoreLost() + " - " + score.getScoreWon() + " " + a.getName());
					return a;
				case 2:
					score.SimulateScore();
					b.setGroupeScore(b.getGroupeScore() + 3);
					b.getGamesScore().add(
							b.getName() + " " + score.getScoreWon() + " - " + score.getScoreLost() + " " + a.getName());
					a.getGamesScore().add(
							a.getName() + " " + score.getScoreLost() + " - " + score.getScoreWon() + " " + b.getName());
					return b;
				case 3:
					a.setGroupeScore(a.getGroupeScore() + 1);
					b.setGroupeScore(b.getGroupeScore() + 1);
					String DeuceScore = score.SimulateScoreDeuce();
					a.getGamesScore().add(a.getName() + " " + DeuceScore + " " + b.getName());
					b.getGamesScore().add(b.getName() + " " + DeuceScore + " " + a.getName());
					return a;
				}
		} else {
			GameOutput caseOne = new GameOutput();
			GameOutput caseTwo = new GameOutput();
			GameOutput caseThree = new GameOutput();
			GameOutput caseFour = new GameOutput();
			GameOutput caseFive = new GameOutput();
			// 1 : a wins
			// 2 : b wins
			// 3 : draw
			caseOne.addNumber(1, 0.2d);
			caseOne.addNumber(2, 0.1d);

			caseTwo.addNumber(1, 0.5d);
			caseTwo.addNumber(2, 0.2d);

			caseThree.addNumber(1, 0.7d);
			caseThree.addNumber(2, 0.15d);

			caseFour.addNumber(1, 0.85d);
			caseFour.addNumber(2, 0.1d);

			caseFive.addNumber(1, 0.9d);
			caseFive.addNumber(2, 0.05d);

			int rate2 = a.getRate() - b.getRate();
			if (rate2 < 0) {
				return gameResut(b, a, true);
			}

			if (rate2 > 0 && rate2 < 200) {
				switch (caseOne.getDistributedRandomNumber()) {
				case 1:
					score.SimulateScore();
					a.setGroupeScore(a.getGroupeScore() + 3);
					a.getGamesScore().add(
							a.getName() + " " + score.getScoreWon() + " - " + score.getScoreLost() + " " + b.getName());
					b.getGamesScore().add(
							b.getName() + " " + score.getScoreLost() + " - " + score.getScoreWon() + " " + a.getName());
					return a;
				case 2:
					score.SimulateScore();
					b.setGroupeScore(b.getGroupeScore() + 3);
					b.getGamesScore().add(
							b.getName() + " " + score.getScoreWon() + " - " + score.getScoreLost() + " " + a.getName());
					a.getGamesScore().add(
							a.getName() + " " + score.getScoreLost() + " - " + score.getScoreWon() + " " + b.getName());
					return b;
				}
			} else if (rate2 >= 200 && rate2 < 500) {
				switch (caseTwo.getDistributedRandomNumber()) {
				case 1:
					score.SimulateScore();
					a.setGroupeScore(a.getGroupeScore() + 3);
					a.getGamesScore().add(
							a.getName() + " " + score.getScoreWon() + " - " + score.getScoreLost() + " " + b.getName());
					b.getGamesScore().add(
							b.getName() + " " + score.getScoreLost() + " - " + score.getScoreWon() + " " + a.getName());
					return a;
				case 2:
					score.SimulateScore();
					b.setGroupeScore(b.getGroupeScore() + 3);
					b.getGamesScore().add(
							b.getName() + " " + score.getScoreWon() + " - " + score.getScoreLost() + " " + a.getName());
					a.getGamesScore().add(
							a.getName() + " " + score.getScoreLost() + " - " + score.getScoreWon() + " " + b.getName());
					return b;
				}
			} else if (rate2 >= 500 && rate2 < 700) {
				switch (caseThree.getDistributedRandomNumber()) {
				case 1:
					score.SimulateScore();
					a.setGroupeScore(a.getGroupeScore() + 3);
					a.getGamesScore().add(
							a.getName() + " " + score.getScoreWon() + " - " + score.getScoreLost() + " " + b.getName());
					b.getGamesScore().add(
							b.getName() + " " + score.getScoreLost() + " - " + score.getScoreWon() + " " + a.getName());
					return a;
				case 2:
					score.SimulateScore();
					b.setGroupeScore(b.getGroupeScore() + 3);
					b.getGamesScore().add(
							b.getName() + " " + score.getScoreWon() + " - " + score.getScoreLost() + " " + a.getName());
					a.getGamesScore().add(
							a.getName() + " " + score.getScoreLost() + " - " + score.getScoreWon() + " " + b.getName());
					return b;
				}
			} else if (rate2 >= 700 && rate2 < 900) {
				switch (caseFour.getDistributedRandomNumber()) {
				case 1:
					score.SimulateScore();
					a.setGroupeScore(a.getGroupeScore() + 3);
					a.getGamesScore().add(
							a.getName() + " " + score.getScoreWon() + " - " + score.getScoreLost() + " " + b.getName());
					b.getGamesScore().add(
							b.getName() + " " + score.getScoreLost() + " - " + score.getScoreWon() + " " + a.getName());
					return a;
				case 2:
					score.SimulateScore();
					b.setGroupeScore(b.getGroupeScore() + 3);
					b.getGamesScore().add(
							b.getName() + " " + score.getScoreWon() + " - " + score.getScoreLost() + " " + a.getName());
					a.getGamesScore().add(
							a.getName() + " " + score.getScoreLost() + " - " + score.getScoreWon() + " " + b.getName());
					return b;

				}
			} else
				switch (caseFive.getDistributedRandomNumber()) {
				case 1:
					score.SimulateScore();
					a.setGroupeScore(a.getGroupeScore() + 3);
					a.getGamesScore().add(
							a.getName() + " " + score.getScoreWon() + " - " + score.getScoreLost() + " " + b.getName());
					b.getGamesScore().add(
							b.getName() + " " + score.getScoreLost() + " - " + score.getScoreWon() + " " + a.getName());
					return a;
				case 2:
					score.SimulateScore();
					b.setGroupeScore(b.getGroupeScore() + 3);
					b.getGamesScore().add(
							b.getName() + " " + score.getScoreWon() + " - " + score.getScoreLost() + " " + a.getName());
					a.getGamesScore().add(
							a.getName() + " " + score.getScoreLost() + " - " + score.getScoreWon() + " " + b.getName());
					return b;
				}
		}
		return a;
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shlWorldCup = new Shell();
		shlWorldCup.setModified(true);
		shlWorldCup.setSize(766, 461);
		shlWorldCup.setText("World Cup 2018 Drawer v3.0.FINAL By Maradjah");

	}
}
