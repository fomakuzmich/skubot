package skubot;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.objects.Update;

public class Bot extends TelegramLongPollingBot {
	
	final private String BOT_TOKEN = "6063497626:AAH1_FMp_OjMjKU8xWl8xbNljqqn8h24wi4";
	final private String BOT_NAME = "lgskubot";

	@Override
	public void onUpdateReceived(Update update) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getBotUsername() {
		return BOT_NAME;
	}

	@Override
	public String getBotToken() {
		return BOT_TOKEN;
	}

}
