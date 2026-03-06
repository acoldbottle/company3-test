package src.service;

import java.util.*;

public class TradeService {

    public static class Trade {
        private String symbol;
        private String userId;
        private int price;
        private int quantity;

        public Trade(String symbol, String userId, int price, int quantity) {
            this.symbol = symbol;
            this.userId = userId;
            this.price = price;
            this.quantity = quantity;
        }

        public String getSymbol() {
            return symbol;
        }

        public String getUserId() {
            return userId;
        }

        public int getPrice() {
            return price;
        }

        public int getQuantity() {
            return quantity;
        }
    }

    /**
     * TODO 1
     *
     * symbol 별 거래 횟수를 집계하세요.
     *
     * return:
     * {
     *   "AAPL": 3,
     *   "TSLA": 2
     * }
     */
    public Map<String, Integer> countTradesBySymbol(List<Trade> trades) {
        return null;
    }

    /**
     * TODO 2
     *
     * 가장 많이 거래된 symbol 을 반환하세요.
     *
     * 거래 횟수가 같으면
     * symbol 이름 오름차순
     */
    public String findMostTradedSymbol(List<Trade> trades) {
        return null;
    }

    /**
     * TODO 3
     *
     * 특정 user 의 거래만 반환하세요.
     */
    public List<Trade> findTradesByUser(List<Trade> trades, String userId) {
        return null;
    }

    /**
     * TODO 4
     *
     * price 기준 내림차순 정렬하세요.
     * price 같으면 symbol 오름차순
     */
    public List<Trade> sortTrades(List<Trade> trades) {
        return null;
    }

    /**
     * TODO 5
     *
     * symbol 별 평균 거래 가격을 계산하세요.
     *
     * return:
     * {
     *   "AAPL": 180.5,
     *   "TSLA": 250.0
     * }
     */
    public Map<String, Double> calculateAveragePrice(List<Trade> trades) {
        return null;
    }

    /**
     * TODO 6
     *
     * 전체 거래 중
     * 가장 가격이 높은 Trade 를 반환하세요.
     */
    public Trade findHighestPriceTrade(List<Trade> trades) {
        return null;
    }

    /**
     * TODO 7
     *
     * symbol 별 총 거래 수량을 계산하세요.
     *
     * quantity 합계
     */
    public Map<String, Integer> calculateTotalQuantityBySymbol(List<Trade> trades) {
        return null;
    }

}