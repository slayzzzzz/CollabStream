package collabstream.streaming;

public enum MsgType {
	END_OF_DATA,
	TRAINING_EXAMPLE,
	PROCESS_BLOCK_REQ,
	PROCESS_BLOCK_FIN,
	USER_MATRIX,
	ITEM_MATRIX,
	USER_MATRIX_REQ,
	ITEM_MATRIX_REQ
}