package meteor.plugins.resourcepacks;

import com.google.common.collect.ImmutableMultimap;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import static meteor.plugins.resourcepacks.WidgetOverride.Script.*;
import static meteor.plugins.resourcepacks.WidgetOverride.Script.ACCOUNT_MANAGEMENT_INIT;
import static meteor.plugins.resourcepacks.WidgetOverride.Script.ACHIEVEMENT_DIARY_ENTRY_REBUILD;
import static meteor.plugins.resourcepacks.WidgetOverride.Script.AUTOCAST_SETUP;
import static meteor.plugins.resourcepacks.WidgetOverride.Script.BANK_INIT;
import static meteor.plugins.resourcepacks.WidgetOverride.Script.BANK_SETTINGS_OPEN;
import static meteor.plugins.resourcepacks.WidgetOverride.Script.CHANNEL_TAB_INIT;
import static meteor.plugins.resourcepacks.WidgetOverride.Script.CHATBOX_BACKGROUND;
import static meteor.plugins.resourcepacks.WidgetOverride.Script.DEATHKEEP_REDRAW;
import static meteor.plugins.resourcepacks.WidgetOverride.Script.FRIENDS_CHAT_BUILD;
import static meteor.plugins.resourcepacks.WidgetOverride.Script.FRIEND_UPDATE;
import static meteor.plugins.resourcepacks.WidgetOverride.Script.GE_OFFERS_INIT;
import static meteor.plugins.resourcepacks.WidgetOverride.Script.GE_OFFERS_SETUP_INIT;
import static meteor.plugins.resourcepacks.WidgetOverride.Script.IGNORE_UPDATE;
import static meteor.plugins.resourcepacks.WidgetOverride.Script.KEYBINDS_INIT;
import static meteor.plugins.resourcepacks.WidgetOverride.Script.KEYBINDS_OPEN_MENU;
import static meteor.plugins.resourcepacks.WidgetOverride.Script.KOUREND_TAB_UPDATE;
import static meteor.plugins.resourcepacks.WidgetOverride.Script.MAKE_ALL_ITEM_HOVER;
import static meteor.plugins.resourcepacks.WidgetOverride.Script.MAKE_ALL_ITEM_OP;
import static meteor.plugins.resourcepacks.WidgetOverride.Script.MAKE_ALL_QUANTITY_DRAW;
import static meteor.plugins.resourcepacks.WidgetOverride.Script.MINIGAMES_TAB_REBUILD;
import static meteor.plugins.resourcepacks.WidgetOverride.Script.OPTIONS_TABS_SWITCH;
import static meteor.plugins.resourcepacks.WidgetOverride.Script.QUEST_TAB_TABS_DRAW;
import static meteor.plugins.resourcepacks.WidgetOverride.Script.SETTINGS_SIDE_TABS_INIT;
import static meteor.plugins.resourcepacks.WidgetOverride.Script.THINKBOX;
import static meteor.plugins.resourcepacks.WidgetOverride.Script.WORLDMAP_INIT;
import static meteor.plugins.resourcepacks.WidgetOverride.Script.WORLDSWITCHER_INIT;
import static meteor.plugins.resourcepacks.WidgetOverride.Script.XPDROPS_SHOW_PANEL;
import static meteor.plugins.resourcepacks.WidgetOverride.Script.ZEAH_FAVOUR_INIT;
import net.runelite.api.widgets.WidgetID;

@Getter
@RequiredArgsConstructor
public enum WidgetOverride
{
	GE_BORDER_BUY_INNER(GE_OFFERS_INIT, 0x5a5245, WidgetID.GRAND_EXCHANGE_GROUP_ID, new int[]{7, 8, 9, 10, 11, 12, 13, 14}, 0),
	GE_BORDER_BUY_OUTER(GE_OFFERS_INIT, 0x383023, WidgetID.GRAND_EXCHANGE_GROUP_ID, new int[]{7, 8, 9, 10, 11, 12, 13, 14}, 3),
	GE_BORDER_SELL_INNER(GE_OFFERS_INIT, 0x5a5245, WidgetID.GRAND_EXCHANGE_GROUP_ID, new int[]{7, 8, 9, 10, 11, 12, 13, 14}, 1),
	GE_BORDER_SELL_OUTER(GE_OFFERS_INIT, 0x383023, WidgetID.GRAND_EXCHANGE_GROUP_ID, new int[]{7, 8, 9, 10, 11, 12, 13, 14}, 4),

	GE_BORDER_OFFER_BUY_OFFER_FULL_INNER(GE_OFFERS_SETUP_INIT, 0x5a5245, WidgetID.GRAND_EXCHANGE_GROUP_ID, 24, 14),
	GE_BORDER_OFFER_BUY_OFFER_FULL_OUTER(GE_OFFERS_SETUP_INIT, 0x383023, WidgetID.GRAND_EXCHANGE_GROUP_ID, 24, 15),
	GE_BORDER_OFFER_BUY_OFFER_BOTTOM_INNER(GE_OFFERS_SETUP_INIT, 0x5a5245, WidgetID.GRAND_EXCHANGE_GROUP_ID, 24, 16),
	GE_BORDER_OFFER_BUY_OFFER_BOTTOM_OUTER(GE_OFFERS_SETUP_INIT, 0x383023, WidgetID.GRAND_EXCHANGE_GROUP_ID, 24, 17),
	GE_BORDER_OFFER_CHOOSE_ITEM_INNER(GE_OFFERS_SETUP_INIT, 0x5a5245, WidgetID.GRAND_EXCHANGE_GROUP_ID, 24, 23),
	GE_BORDER_OFFER_CHOOSE_ITEM_OUTER(GE_OFFERS_SETUP_INIT, 0x383023, WidgetID.GRAND_EXCHANGE_GROUP_ID, 24, 24),
	GE_BORDER_OFFER_QUANTITY_INNER(GE_OFFERS_SETUP_INIT, 0x5a5245, WidgetID.GRAND_EXCHANGE_GROUP_ID, 24, 26),
	GE_BORDER_OFFER_QUANTITY_OUTER(GE_OFFERS_SETUP_INIT, 0x383023, WidgetID.GRAND_EXCHANGE_GROUP_ID, 24, 27),
	GE_BORDER_OFFER_PRICE_INNER(GE_OFFERS_SETUP_INIT, 0x5a5245, WidgetID.GRAND_EXCHANGE_GROUP_ID, 24, 33),
	GE_BORDER_OFFER_PRICE_OUTER(GE_OFFERS_SETUP_INIT, 0x383023, WidgetID.GRAND_EXCHANGE_GROUP_ID, 24, 34),

	GE_CHATBOX_BUY_SEARCH_BORDER_INNER(GE_OFFERS_SETUP_INIT, 0x463214, WidgetID.CHATBOX_GROUP_ID, 51, -1),
	GE_CHATBOX_BUY_SEARCH_BORDER_OUTER(GE_OFFERS_SETUP_INIT, 0x463214, WidgetID.CHATBOX_GROUP_ID, 52, -1),
	GE_CHATBOX_BUY_SEARCH_BACKGROUND(GE_OFFERS_SETUP_INIT, 0x463214, WidgetID.CHATBOX_GROUP_ID, 50, -1),

	KEYBINDS_SMALL_BACKGROUND(KEYBINDS_INIT, 0x2e281d, 121, new int[]{6, 13, 20, 27, 34, 41, 48, 55, 62, 69, 76, 83, 90, 97}, -1),
	KEYBINDS_SMALL_BORDER(KEYBINDS_INIT, 0x544834, 121, new int[]{7, 14, 21, 28, 35, 42, 49, 56, 63, 70, 77, 84, 91, 98}, -1),
	KEYBINDS_MENU_BACKGROUND(KEYBINDS_OPEN_MENU, 0x2e281d, 121, 109, -1),
	KEYBINDS_MENU_BORDER(KEYBINDS_OPEN_MENU, 0x544834, 121, 110, -1),

	MAKE_ALL_BACKGROUND_HOVER(MAKE_ALL_ITEM_HOVER, 0x89785e, 270, new int[]{14, 15, 16, 17, 18}, 29),
	MAKE_ALL_BACKGROUND_CLICKED(MAKE_ALL_ITEM_OP, 0x89785e, 270, new int[]{14, 15, 16, 17, 18}, 29),
	MAKE_ALL_QUANTITY_SELECTED(MAKE_ALL_QUANTITY_DRAW, 0x89785e, 270, new int[]{7, 8, 9, 10, 11, 12}, 0),

	ACCOUNT_MANAGEMENT_TAB_LINE(ACCOUNT_MANAGEMENT_INIT, 0x5d5848, 109, new int[]{2, 3, 4, 5}, -1),

	CHATBOX_SEPERATOR_LINE(CHATBOX_BACKGROUND, 0x807660, WidgetID.CHATBOX_GROUP_ID, 54, 0),

	FRIENDS_CHAT_BORDER_FULL_INNER(FRIENDS_CHAT_BUILD, 0x474745, WidgetID.FRIENDS_CHAT_GROUP_ID, 9, 1),
	FRIENDS_CHAT_BORDER_FULL_OUTER(FRIENDS_CHAT_BUILD, 0xe0e0c, WidgetID.FRIENDS_CHAT_GROUP_ID, 9, 0),
	FRIENDS_CHAT_BORDER_TOP_INNER(FRIENDS_CHAT_BUILD, 0x474745, WidgetID.FRIENDS_CHAT_GROUP_ID, 10, 1),
	FRIENDS_CHAT_BORDER_TOP_OUTER(FRIENDS_CHAT_BUILD, 0xe0e0c, WidgetID.FRIENDS_CHAT_GROUP_ID, 10, 0),

	FRIENDS_TOP_LINE_ABOVE(FRIEND_UPDATE, 0x474745, WidgetID.FRIENDS_LIST_GROUP_ID, 6, 1),
	FRIENDS_TOP_LINE_BELOW(FRIEND_UPDATE, 0xe0e0c, WidgetID.FRIENDS_LIST_GROUP_ID, 6, 0),

	IGNORE_TOP_LINE_ABOVE(IGNORE_UPDATE, 0x474745, WidgetID.IGNORE_LIST_GROUP_ID, 6, 1),
	IGNORE_TOP_LINE_BELOW(IGNORE_UPDATE, 0xe0e0c, WidgetID.IGNORE_LIST_GROUP_ID, 6, 0),

	QUEST_TAB_TABS_UNDERLINE(QUEST_TAB_TABS_DRAW, 0x5d5848, 629, 2, -1),

	XPDROPS_BORDER_INNER(XPDROPS_SHOW_PANEL, 0x5a5245, WidgetID.EXPERIENCE_DROP_GROUP_ID, new int[]{8, 13}, -1),
	XPDROPS_BORDER_OUTER(XPDROPS_SHOW_PANEL, 0x383023, WidgetID.EXPERIENCE_DROP_GROUP_ID, new int[]{7, 12}, -1),

	// Needs to be updated if an achievement diary is added
	ACHIEVEMENT_DIARY_BORDER(ACHIEVEMENT_DIARY_ENTRY_REBUILD, 0xff9933, WidgetID.ACHIEVEMENT_DIARY_GROUP_ID, 2, new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11}),
	ACHIEVEMENT_DIARY_PROGRESS_BORDER(ACHIEVEMENT_DIARY_ENTRY_REBUILD, 0x000000, WidgetID.ACHIEVEMENT_DIARY_GROUP_ID, 2, new int[]{15, 27, 39, 51, 63, 75, 87, 99, 111, 123, 135, 147}),

	KOUREND_fAVVOUR_TAB_ARCEUUS_BORDER_INNER(KOUREND_TAB_UPDATE, 0x000000, 245, 6, -1),
	KOUREND_fAVVOUR_TAB_ARCEUUS_BORDER_OUTER(KOUREND_TAB_UPDATE, 0x2000c8, 245, 5, 0),
	KOUREND_fAVVOUR_TAB_ARCEUUS_FILL(KOUREND_TAB_UPDATE, 0x2000c8, 245, 7, 0),
	KOUREND_fAVVOUR_TAB_HOSIDIUS_BORDER_INNER(KOUREND_TAB_UPDATE, 0x000000, 245, 9, -1),
	KOUREND_fAVVOUR_TAB_HOSIDIUS_BORDER_OUTER(KOUREND_TAB_UPDATE, 0x20c008, 245, 8, 0),
	KOUREND_fAVVOUR_TAB_HOSIDIUS_FILL(KOUREND_TAB_UPDATE, 0x20c008, 245, 10, 0),
	KOUREND_fAVVOUR_TAB_LOVAKENGJ_BORDER_INNER(KOUREND_TAB_UPDATE, 0x000000, 245, 12, -1),
	KOUREND_fAVVOUR_TAB_LOVAKENGJ_BORDER_OUTER(KOUREND_TAB_UPDATE, 0xc05008, 245, 11, 0),
	KOUREND_fAVVOUR_TAB_LOVAKENGJ_FILL(KOUREND_TAB_UPDATE, 0xc05008, 245, 13, 0),
	KOUREND_fAVVOUR_TAB_PISCARILIUS_BORDER_INNER(KOUREND_TAB_UPDATE, 0x000000, 245, 15, -1),
	KOUREND_fAVVOUR_TAB_PISCARILIUS_BORDER_OUTER(KOUREND_TAB_UPDATE, 0x98a0, 245, 14, 0),
	KOUREND_fAVVOUR_TAB_PISCARILIUS_FILL(KOUREND_TAB_UPDATE, 0x98a0, 245, 16, 0),
	KOUREND_fAVVOUR_TAB_SHAYZIEN_BORDER_INNER(KOUREND_TAB_UPDATE, 0x000000, 245, 18, -1),
	KOUREND_fAVVOUR_TAB_SHAYZIEN_BORDER_OUTER(KOUREND_TAB_UPDATE, 0x980810, 245, 17, 0),
	KOUREND_fAVVOUR_TAB_SHAYZIEN_FILL(KOUREND_TAB_UPDATE, 0x980810, 245, 19, 0),

	MINIGAMES_TAB_BORDER_INNER(MINIGAMES_TAB_REBUILD, 0xff981f, WidgetID.MINIGAME_TAB_ID, new int[]{7, 11, 17}, -1),
	MINIGAMES_TAB_BORDER_OUTER(MINIGAMES_TAB_REBUILD, 0x191900, WidgetID.MINIGAME_TAB_ID, new int[]{6, 10, 16}, -1),

	OPTIONS_CONTROLS_MENU_BORDER_INNER(OPTIONS_TABS_SWITCH, 0x474745, WidgetID.SETTINGS_SIDE_GROUP_ID, new int[]{91, 92}, 2),
	OPTIONS_CONTROLS_MENU_BORDER_OUTER(OPTIONS_TABS_SWITCH, 0xe0e0c, WidgetID.SETTINGS_SIDE_GROUP_ID, new int[]{91, 92}, 1),
	OPTIONS_CONTROLS_DROPDOWN_BORDER_INNER(THINKBOX, 0x474745, WidgetID.SETTINGS_SIDE_GROUP_ID, 106, 1),
	OPTIONS_CONTROLS_DROPDOWN_BORDER_OUTER(THINKBOX, 0xe0e0c, WidgetID.SETTINGS_SIDE_GROUP_ID, 106, 0),

	COMBAT_CHOOSE_SPELL_BACKGROUND(AUTOCAST_SETUP, 0x000000, 201, 3, -1),
	COMBAT_CHOOSE_SPELL_INNER(AUTOCAST_SETUP, 0x726451, 201, 4, -1),
	COMBAT_CHOOSE_SPELL_OUTER(AUTOCAST_SETUP, 0x2e2b23, 201, 5, -1),

	ITEMS_KEPT_ON_DEATH_BORDER_INNER(DEATHKEEP_REDRAW, 0xe0e0c, WidgetID.KEPT_ON_DEATH_GROUP_ID, new int[]{4, 5, 12}, new int[]{0, 4}),
	ITEMS_KEPT_ON_DEATH_BORDER_OUTER(DEATHKEEP_REDRAW, 0x474745, WidgetID.KEPT_ON_DEATH_GROUP_ID, new int[]{4, 5, 12}, new int[]{1, 5}),

	WORLD_SWITCH_TOP_AND_BOTTOM_LINES(WORLDSWITCHER_INIT, 0x73654a, WidgetID.WORLD_SWITCHER_GROUP_ID, new int[]{6, 7}, -1),

	WORLD_MAP_SEARCH_BORDER_INNER(WORLDMAP_INIT, 0x474745, WidgetID.WORLD_MAP_GROUP_ID, 25, 4),
	WORLD_MAP_SEARCH_BORDER_OUTER(WORLDMAP_INIT, 0xe0e0c, WidgetID.WORLD_MAP_GROUP_ID, 25, 3),
	WORLD_MAP_PLACE_BORDER_INNER(WORLDMAP_INIT, 0x474745, WidgetID.WORLD_MAP_GROUP_ID, 26, 2),
	WORLD_MAP_PLACE_BORDER_OUTER(WORLDMAP_INIT, 0xe0e0c, WidgetID.WORLD_MAP_GROUP_ID, 26, 1),
	WORLD_MAP_PLACE_DROPDOWN_BORDER_INNER(WORLDMAP_INIT, 0x474745, WidgetID.WORLD_MAP_GROUP_ID, 33, 1),
	WORLD_MAP_PLACE_DROPDOWN_BORDER_OUTER(WORLDMAP_INIT, 0xe0e0c, WidgetID.WORLD_MAP_GROUP_ID, 33, 0),

	BANK_TAB_UNDERLINE(BANK_INIT, 0x2e2b23, WidgetID.BANK_GROUP_ID, 11, -1),
	BANK_OPTIONS_BORDER_TAB_DISPLAY_INNER(BANK_SETTINGS_OPEN, 0x2e2b23, WidgetID.BANK_GROUP_ID, 49, 13),
	BANK_OPTIONS_BORDER_TAB_DISPLAY_OUTER(BANK_SETTINGS_OPEN, 0x726451, WidgetID.BANK_GROUP_ID, 49, 14),
	BANK_OPTIONS_BORDER_BANK_FILLERS_INNER(BANK_SETTINGS_OPEN, 0x2e2b23, WidgetID.BANK_GROUP_ID, 56, 1),
	BANK_OPTIONS_BORDER_BANK_FILLERS_OUTER(BANK_SETTINGS_OPEN, 0x726451, WidgetID.BANK_GROUP_ID, 56, 2),

	KOUREND_FAVOUR_DIALOG_SEPERATOR_LINE_UPPER(ZEAH_FAVOUR_INIT, 0x2e2b23, 626, 5, -1),
	KOUREND_FAVOUR_DIALOG_SEPERATOR_LINE_LOWER(ZEAH_FAVOUR_INIT, 0x2e2b23, 626, 4, -1),
	OPTIONS_TAB_SEPERATOR_LINE(SETTINGS_SIDE_TABS_INIT, 0x5d5848, WidgetID.SETTINGS_SIDE_GROUP_ID, new int[]{61, 62, 63, 64}, -1),
	CHANNEL_TAB_SEPERATOR_LINE(CHANNEL_TAB_INIT, 0x5d5848, 707, 2, -1),
	;

	private final int scriptId;
	private final int defaultColor;
	private final int widgetGroupId;
	private final int[] widgetChildIds;
	private final int[] widgetArrayIds;


	WidgetOverride(int scriptId, int defaultColor, int widgetGroupId, int[] widetChildIds, int widgetArrayId)
	{
		this(scriptId, defaultColor, widgetGroupId, widetChildIds, new int[]{widgetArrayId});
	}

	WidgetOverride(int scriptId, int defaultColor, int widgetGroupId, int widetChildId, int widgetArrayId)
	{
		this(scriptId, defaultColor, widgetGroupId, widetChildId, new int[]{widgetArrayId});
	}

	WidgetOverride(int scriptId, int defaultColor, int widgetGroupId, int widetChildId, int[] widgetArrayIds)
	{
		this(scriptId, defaultColor, widgetGroupId, new int[]{widetChildId}, widgetArrayIds);
	}

	static final ImmutableMultimap<Integer, WidgetOverride> scriptWidgetOverrides;

	static
	{
		ImmutableMultimap.Builder<Integer, WidgetOverride> builder = new ImmutableMultimap.Builder<>();

		for (WidgetOverride widgetOverride : values())
		{
			builder.put(widgetOverride.scriptId, widgetOverride);
		}

		scriptWidgetOverrides = builder.build();
	}


	static class Script
	{
		static final int GE_OFFERS_INIT = 803;
		static final int GE_OFFERS_SETUP_INIT = 773;
		static final int KEYBINDS_INIT = 984;
		static final int KEYBINDS_OPEN_MENU = 985;
		static final int MAKE_ALL_ITEM_HOVER = 2049;
		static final int MAKE_ALL_QUANTITY_DRAW = 2058;
		static final int MAKE_ALL_ITEM_OP = 2044;
		static final int ACCOUNT_MANAGEMENT_INIT = 2497;
		static final int CHATBOX_BACKGROUND = 923;
		static final int FRIENDS_CHAT_BUILD = 1658;
		static final int FRIEND_UPDATE = 125;
		static final int IGNORE_UPDATE = 129;
		static final int QUEST_TAB_TABS_DRAW = 2800;
		static final int XPDROPS_SHOW_PANEL = 997;
		static final int ACHIEVEMENT_DIARY_ENTRY_REBUILD = 2199;
		static final int KOUREND_TAB_UPDATE = 1229;
		static final int MINIGAMES_TAB_REBUILD = 435;
		static final int AUTOCAST_SETUP = 2098;
		static final int DEATHKEEP_REDRAW = 974;
		static final int WORLDSWITCHER_INIT = 747;
		static final int WORLDMAP_INIT = 1707;
		static final int BANK_INIT = 274;
		static final int BANK_SETTINGS_OPEN = 3276;
		static final int THINKBOX = 715;
		static final int OPTIONS_TABS_SWITCH = 529;
		static final int ZEAH_FAVOUR_INIT = 1203;
		static final int SETTINGS_SIDE_TABS_INIT = 3909;
		static final int CHANNEL_TAB_INIT = 4471;
	}
}
