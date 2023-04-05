/**
 */
package org.hl7.emf.fhir;

import java.lang.String;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Operation Outcome Codes Enum</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.hl7.emf.fhir.FhirPackage#getOperationOutcomeCodesEnum()
 * @model extendedMetaData="name='OperationOutcomeCodesEnum'"
 * @generated
 */
public enum OperationOutcomeCodesEnum implements Enumerator {
	/**
	 * The '<em><b>DELETEMULTIPLEMATCHES</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Error: Multiple matches exist for the conditional delete
	 * Fout: er is meer dan één resultaat voor de conditionele delete
	 * <!-- end-model-doc -->
	 * @see #DELETEMULTIPLEMATCHES_VALUE
	 * @generated
	 * @ordered
	 */
	DELETEMULTIPLEMATCHES(0, "DELETEMULTIPLEMATCHES", "DELETE_MULTIPLE_MATCHES"),

	/**
	 * The '<em><b>MSGAUTHREQUIRED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * You must authenticate before you can use this service
	 * Autenticazione richiesta prima di usare questo servizio
	 * Wymagana autentykacja przed użyciem tego serwisu
	 * Vous devez être authentifié avant de pouvoir utiliser ce service
	 * U moet zich authenticeren voor gebruik van deze service
	 * 使用此服务前需认证
	 * Debe autenticarse antes de poder usar este servicio
	 * <!-- end-model-doc -->
	 * @see #MSGAUTHREQUIRED_VALUE
	 * @generated
	 * @ordered
	 */
	MSGAUTHREQUIRED(1, "MSGAUTHREQUIRED", "MSG_AUTH_REQUIRED"),

	/**
	 * The '<em><b>MSGBADFORMAT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Bad Syntax: "%s" must be a %s'
	 * Неверный синтакс: "%s" должен быть %s
	 * Sintassi Errata: "%s" deve essere un %s'
	 * Błąd składni: "%s" powinno być %s'
	 * Erreur de Syntaxe : "%s" doit être un %s
	 * Verkeerde syntax: "%s" moet een %s zijn
	 * 句法错误: "%s" 必须是一个 %s'
	 * Sintaxis Incorrecta: "%s" debe de ser un %s'
	 * <!-- end-model-doc -->
	 * @see #MSGBADFORMAT_VALUE
	 * @generated
	 * @ordered
	 */
	MSGBADFORMAT(2, "MSGBADFORMAT", "MSG_BAD_FORMAT"),

	/**
	 * The '<em><b>MSGBADSYNTAX</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Bad Syntax in %s
	 * Неверный синтакс: %s
	 * Sintassi errata in %s
	 * Błąd składni w %s
	 * Erreur de Syntaxe dans %s
	 * Verkeerde syntax in %s
	 * %s 中句法错误
	 * Sintaxis Incorrecta en %s
	 * <!-- end-model-doc -->
	 * @see #MSGBADSYNTAX_VALUE
	 * @generated
	 * @ordered
	 */
	MSGBADSYNTAX(3, "MSGBADSYNTAX", "MSG_BAD_SYNTAX"),

	/**
	 * The '<em><b>MSGCANTPARSECONTENT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Unable to parse feed (entry content type = "%s")
	 * Impossibile effettuare il parsing del feed (tipo del contenuto della entry = "%s")
	 * Błąd parsowania (typ zawartości wejściowej = "%s")
	 * Impossible d'analyser le flux (type de contenu de l'entrée = "%s")
	 * Kan feed niet verwerken (contenttype inhoud = "%s")
	 * 无法解析feed (条目的内容类型 = "%s")
	 * No se pudo parsear el feed (el tipo de contenido de la entry = "%s")
	 * <!-- end-model-doc -->
	 * @see #MSGCANTPARSECONTENT_VALUE
	 * @generated
	 * @ordered
	 */
	MSGCANTPARSECONTENT(4, "MSGCANTPARSECONTENT", "MSG_CANT_PARSE_CONTENT"),

	/**
	 * The '<em><b>MSGCANTPARSEROOT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Unable to parse feed (root element name = "%s")
	 * Не удалось разобрать данные (корневой элемент = "%s")
	 * Impossibile effettuare il parsing del feed (nome elemento root = "%s")
	 * Błąd parsowania (nazwa elementu root = "%s")
	 * Impossible d'analyser le flux (nom de l'élément racine = "%s")
	 * Kan feed niet verwerken (rootelementnaam = "%s")
	 * 无法解析feed (根元素名 = "%s")
	 * No se pudo parsear el feed (nombre del elemento raiz = "%s")
	 * <!-- end-model-doc -->
	 * @see #MSGCANTPARSEROOT_VALUE
	 * @generated
	 * @ordered
	 */
	MSGCANTPARSEROOT(5, "MSGCANTPARSEROOT", "MSG_CANT_PARSE_ROOT"),

	/**
	 * The '<em><b>MSGCREATED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * New resource created
	 * Nieuwe resource gemaakt
	 * <!-- end-model-doc -->
	 * @see #MSGCREATED_VALUE
	 * @generated
	 * @ordered
	 */
	MSGCREATED(6, "MSGCREATED", "MSG_CREATED"),

	/**
	 * The '<em><b>MSGDATEFORMAT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Date value %s is not in the correct format (Xml Date Format required)
	 * Значение Date %s в неверном формате (требуется Xml Date формат)
	 * Il valore %s per la data non è nel formato corretto (richiesto il Formato Data Xml)
	 * Niepoprawny format wartości daty %s (wymagany format XML)
	 * Le format de la date %s est incorrect (format Date Xml attendu)
	 * De Datum-waarde %s heeft niet de juiste structuur (Xml Date vereist)
	 * 日期的值 %s 格式不正确 (要求是Xml Date格式)
	 * El valor de la fecha %s no está en el formato correcto (se requiere un formato de fecha Xml)
	 * <!-- end-model-doc -->
	 * @see #MSGDATEFORMAT_VALUE
	 * @generated
	 * @ordered
	 */
	MSGDATEFORMAT(7, "MSGDATEFORMAT", "MSG_DATE_FORMAT"),

	/**
	 * The '<em><b>MSGDELETED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This resource has been deleted
	 * Данный ресурс был удалён
	 * Questa risorsa è stata cancellata
	 * Ten zasób został usunięty
	 * La ressource a été supprimée
	 * Deze resource is verwijderd
	 * 该资源已删除
	 * Este recurso ha sido borrado
	 * <!-- end-model-doc -->
	 * @see #MSGDELETED_VALUE
	 * @generated
	 * @ordered
	 */
	MSGDELETED(8, "MSGDELETED", "MSG_DELETED"),

	/**
	 * The '<em><b>MSGDELETEDDONE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Resource deleted
	 * Ресурс удалён
	 * Risorsa cancellata
	 * Zasób usunięto
	 * Ressource supprimée
	 * Resource verwijderd
	 * 资源已删除
	 * Recurso borrado
	 * <!-- end-model-doc -->
	 * @see #MSGDELETEDDONE_VALUE
	 * @generated
	 * @ordered
	 */
	MSGDELETEDDONE(9, "MSGDELETEDDONE", "MSG_DELETED_DONE"),

	/**
	 * The '<em><b>MSGDELETEDID</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The resource "%s" has been deleted
	 * Ресурс "%s" был удалён
	 * La risorsa "%s" è stata eliminata
	 * Zasób "%s" został usunięty
	 * La ressource "%s" a été supprimée
	 * De resource "%s" is verwijderd
	 * 资源 "%s" 已被删除
	 * El recurso "%s" ha sido borrado
	 * <!-- end-model-doc -->
	 * @see #MSGDELETEDID_VALUE
	 * @generated
	 * @ordered
	 */
	MSGDELETEDID(10, "MSGDELETEDID", "MSG_DELETED_ID"),

	/**
	 * The '<em><b>MSGDUPLICATEID</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Duplicate Id %s for resource type %s
	 * Дублирующий Id %s для типа ресурса %s
	 * Id %s duplicato per il tipo di risorsa %s
	 * Zdublowany identyfikator %s dla zasobu typu %s
	 * Id %s en double pour le type de ressource %s
	 * Duplicaat-id %s voor resourcetype %s
	 * ID %s 重复（资源类型 %s）
	 * Id %s duplicada para el recurso de tipo %s
	 * <!-- end-model-doc -->
	 * @see #MSGDUPLICATEID_VALUE
	 * @generated
	 * @ordered
	 */
	MSGDUPLICATEID(11, "MSGDUPLICATEID", "MSG_DUPLICATE_ID"),

	/**
	 * The '<em><b>MSGERRORPARSING</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Error parsing resource Xml (%s)
	 * Ошибка синтаксического разбора ресурса Xml (%s)
	 * Errore nel parsing della risorsa Xml (%s)
	 * Błąd w trakcie parsowania zasobu XML (%s)
	 * Erreur d'analyse de la ressource Xml (%s)
	 * Fout in verwerking resource Xml (%s)
	 * 解析资源Xml时出错 (%s)
	 * Error parseando el recurso Xml (%s)
	 * <!-- end-model-doc -->
	 * @see #MSGERRORPARSING_VALUE
	 * @generated
	 * @ordered
	 */
	MSGERRORPARSING(12, "MSGERRORPARSING", "MSG_ERROR_PARSING"),

	/**
	 * The '<em><b>MSGIDINVALID</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Id "%s" has an invalid character "%s"
	 * Id "%s" содержит недопустимые символы "%s"
	 * L''Id "%s" ha un carattere non valido: "%s"
	 * Identyfikator "%s" zawiera niepoprawny znak "%s"
	 * Id "%s" possède un caractère invalide "%s"
	 * Id "%s" heeft een ongeldig teken "%s"
	 * ID "%s" 带有非法字符: "%s"
	 * El Id "%s" contiene el caracter inválido "%s"
	 * <!-- end-model-doc -->
	 * @see #MSGIDINVALID_VALUE
	 * @generated
	 * @ordered
	 */
	MSGIDINVALID(13, "MSGIDINVALID", "MSG_ID_INVALID"),

	/**
	 * The '<em><b>MSGIDTOOLONG</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Id "%s" too long (length limit 36)
	 * Недопустимая длина Id "%s" (ограничение 36)
	 * Id "%s" troppo lunga (limite di lunghezza: 36)
	 * Identyfikator "%s" jest zbyt długi (limit długości 36)
	 * Id "%s" trop long (la longueur limite est 36)
	 * Id "%s" te lang (max lengte 36)
	 * Id "%s" 过长 (长度限制: 36)
	 * El Id "%s" es demasiado largo (limite de longitud: 36)
	 * <!-- end-model-doc -->
	 * @see #MSGIDTOOLONG_VALUE
	 * @generated
	 * @ordered
	 */
	MSGIDTOOLONG(14, "MSGIDTOOLONG", "MSG_ID_TOO_LONG"),

	/**
	 * The '<em><b>MSGINVALIDID</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Id not accepted
	 * Id не принято
	 * Id non accettato
	 * Identyfikator nie zaakceptowany
	 * Id non accepté
	 * Id niet geaccepteerd
	 * Id不被接受
	 * Id no aceptada
	 * <!-- end-model-doc -->
	 * @see #MSGINVALIDID_VALUE
	 * @generated
	 * @ordered
	 */
	MSGINVALIDID(15, "MSGINVALIDID", "MSG_INVALID_ID"),

	/**
	 * The '<em><b>MSGJSONOBJECT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Json Source for a resource should start with an object
	 * Json Source для ресурса должен начинаться с объекта
	 * Il sorgente Json di una risorsa dovrebbe iniziare con un oggetto
	 * Źródło json dla zasobu powinno rozpoczynać się od obiektu
	 * La source Json pour une ressource doit commencer par un objet
	 * Json Source van een resource moeten beginnen met een object
	 * 资源的Json源应以一个object开始
	 * La fuente Json para un recurso debería empezar con un objeto
	 * <!-- end-model-doc -->
	 * @see #MSGJSONOBJECT_VALUE
	 * @generated
	 * @ordered
	 */
	MSGJSONOBJECT(16, "MSGJSONOBJECT", "MSG_JSON_OBJECT"),

	/**
	 * The '<em><b>MSGLOCALFAIL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Unable to resolve local reference to resource %s
	 * Невозможно определить локальную ссылку на ресурс %s
	 * Impossibile risolvere il riferimento locale alla risorsa %s
	 * Zasób wskazywany przez loklaną referencję %s nie został odnaleziony
	 * Impossible de résourdre la référence locale à la ressource %s
	 * De resource met lokale referentie %s is niet gevonden
	 * 无法解析对资源 %s 的本地引用
	 * Imposible resolver la referencia al recurso %s
	 * <!-- end-model-doc -->
	 * @see #MSGLOCALFAIL_VALUE
	 * @generated
	 * @ordered
	 */
	MSGLOCALFAIL(17, "MSGLOCALFAIL", "MSG_LOCAL_FAIL"),

	/**
	 * The '<em><b>MSGNOEXIST</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Resource Id "%s" does not exist
	 * Ресурс Id "%s" не существует
	 * La risorsa con Id "%s" non esiste
	 * Zasób o identyfikatorze "%s" nie istnieje
	 * La ressource avec l'Id "%s" n'existe pas
	 * Resource-id "%s" bestaat niet
	 * 资源Id "%s"不存在
	 * El recurso con Id "%s" no existe
	 * <!-- end-model-doc -->
	 * @see #MSGNOEXIST_VALUE
	 * @generated
	 * @ordered
	 */
	MSGNOEXIST(18, "MSGNOEXIST", "MSG_NO_EXIST"),

	/**
	 * The '<em><b>MSGNOMATCH</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * No Resource found matching the query "%s"
	 * Nessuna Risorsa soddisfa la query "%s"
	 * Geen resource gevonden met query "%s"
	 * <!-- end-model-doc -->
	 * @see #MSGNOMATCH_VALUE
	 * @generated
	 * @ordered
	 */
	MSGNOMATCH(19, "MSGNOMATCH", "MSG_NO_MATCH"),

	/**
	 * The '<em><b>MSGNOMODULE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * No module could be found to handle the request "%s"
	 * Модуль для обработки запроса "%s" не найден
	 * Impossibile trovare un modulo per gestire la richiesta "%s"
	 * Nie można odnaleźć modułu, aby obsłużyć żądanie "%s"
	 * Aucun module disponible pour traiter la requête "%s"
	 * Er kon geen module worden gevonden om verzoek "%s" te verwerken
	 * 无法找到处理请求"%s"的模块
	 * No se encontró un modulo que gestione la petición "%s"
	 * <!-- end-model-doc -->
	 * @see #MSGNOMODULE_VALUE
	 * @generated
	 * @ordered
	 */
	MSGNOMODULE(20, "MSGNOMODULE", "MSG_NO_MODULE"),

	/**
	 * The '<em><b>MSGNOSUMMARY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * No Summary for this resource
	 * Отсутствует Summary для данного ресурса
	 * Nessun riepilogo per questa risorsa
	 * Brak podsumowania (Summary) dla tego zasobu
	 * Aucun résumé disponible pour cette ressource
	 * Geen samenvatting voor deze resource
	 * 该资源无summary
	 * No existe un resumen para este recurso
	 * <!-- end-model-doc -->
	 * @see #MSGNOSUMMARY_VALUE
	 * @generated
	 * @ordered
	 */
	MSGNOSUMMARY(21, "MSGNOSUMMARY", "MSG_NO_SUMMARY"),

	/**
	 * The '<em><b>MSGOPNOTALLOWED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Operation %s not allowed for resource %s (due to local configuration)
	 * Операция %s недопустима для ресурса %s (по причине локальной конфигурации)
	 * Operazione %s non consentita per la risorsa %s (a causa di configurazioni locali)
	 * Niedozwolona operacja %s dla zasobu %s (ze względu na lokalną konfigurację)
	 * L'opération %s n'est pas permise pour la ressource %s (à cause de la configuration locale)
	 * Bewerking %s niet toegestaan voor resource %s (vanwege lokale configuratie)
	 * 操作 %s 不允许，对于资源 %s (由于本地配置)
	 * Operación %s no permitida para el recurso %s (debido a la configuración local)
	 * <!-- end-model-doc -->
	 * @see #MSGOPNOTALLOWED_VALUE
	 * @generated
	 * @ordered
	 */
	MSGOPNOTALLOWED(22, "MSGOPNOTALLOWED", "MSG_OP_NOT_ALLOWED"),

	/**
	 * The '<em><b>MSGPARAMCHAINED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Unknown chained parameter name "%s"
	 * Неизвестое вложенное наименование параметра "%s"
	 * Nome di parametro concatenato sconosciuto: "%s"
	 * Nieznana nazwa parametru powiązanego "%s"
	 * Nom du paramètre chainé inconnu : "%s"
	 * Onbekende geschakelde parameternaam "%s"
	 * 未知的链式参数名: "%s"
	 * Nombre de parametro encadenado desconocido: "%s"
	 * <!-- end-model-doc -->
	 * @see #MSGPARAMCHAINED_VALUE
	 * @generated
	 * @ordered
	 */
	MSGPARAMCHAINED(23, "MSGPARAMCHAINED", "MSG_PARAM_CHAINED"),

	/**
	 * The '<em><b>MSGPARAMINVALID</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Parameter "%s" content is invalid
	 * Il contenuto del Parametro "%s" non è valido
	 * Waarde van parameter "%s" is ongeldig
	 * <!-- end-model-doc -->
	 * @see #MSGPARAMINVALID_VALUE
	 * @generated
	 * @ordered
	 */
	MSGPARAMINVALID(24, "MSGPARAMINVALID", "MSG_PARAM_INVALID"),

	/**
	 * The '<em><b>MSGPARAMMODIFIERINVALID</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Parameter "%s" modifier is invalid
	 * Modifier van parameter "%s" is ongeldig
	 * <!-- end-model-doc -->
	 * @see #MSGPARAMMODIFIERINVALID_VALUE
	 * @generated
	 * @ordered
	 */
	MSGPARAMMODIFIERINVALID(25, "MSGPARAMMODIFIERINVALID", "MSG_PARAM_MODIFIER_INVALID"),

	/**
	 * The '<em><b>MSGPARAMNOREPEAT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Parameter "%s" is not allowed to repeat
	 * Параметр "%s" не может быть повторён
	 * Non � consentito ripetere il parametro "%s"
	 * Parametr "%s" nie może zostać powtórzony
	 * Le paramètre "%s" ne peut pas être répété
	 * Parameter "%s" mag niet herhalen
	 * 参数"%s"不可重复
	 * No se permite la repetición del parámetro "%s"
	 * <!-- end-model-doc -->
	 * @see #MSGPARAMNOREPEAT_VALUE
	 * @generated
	 * @ordered
	 */
	MSGPARAMNOREPEAT(26, "MSGPARAMNOREPEAT", "MSG_PARAM_NO_REPEAT"),

	/**
	 * The '<em><b>MSGPARAMUNKNOWN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Parameter "%s" not understood
	 * Параметр "%s" не понят
	 * Parametro "%s" non riconosciuto
	 * Niezrozumiały parametr "%s"
	 * Paramètre "%s" non reconnu
	 * Parameter "%s" onbekend
	 * 无法理解参数"%s"
	 * Parámetro "%s" no reconocido
	 * <!-- end-model-doc -->
	 * @see #MSGPARAMUNKNOWN_VALUE
	 * @generated
	 * @ordered
	 */
	MSGPARAMUNKNOWN(27, "MSGPARAMUNKNOWN", "MSG_PARAM_UNKNOWN"),

	/**
	 * The '<em><b>MSGREMOTEFAIL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Unable to resolve local reference to resource %s
	 * <!-- end-model-doc -->
	 * @see #MSGREMOTEFAIL_VALUE
	 * @generated
	 * @ordered
	 */
	MSGREMOTEFAIL(28, "MSGREMOTEFAIL", "MSG_REMOTE_FAIL"),

	/**
	 * The '<em><b>MSGRESOURCEEXAMPLEPROTECTED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Resources with identity "example" cannot be deleted (for testing/training purposes)
	 * Ресурс с идентификатором "example" не может быть удалён (для случаев тестирования/обучения)
	 * Le Risorse aventi l'identità "example" non possono essere cancellate (per finalità di test/formazione)
	 * Zasoby oznaczone jako "example" nie mogą zostać usunięte (dla celów testów/szkoleń)
	 * Les ressources ayant l'identité "example" ne peuvent pas être supprimées (utilisées pour les tests/formations)
	 * Resources met identiteit "voorbeeld" kunnen niet worden verwijderd (ten behoeve van testen/training)
	 * 以"example" 为ID的资源不能被删除 (用于测试/培训)
	 * Recursos con la identidad "example" no pueden ser borrados (son usados para pruebas/entrenamiento)
	 * <!-- end-model-doc -->
	 * @see #MSGRESOURCEEXAMPLEPROTECTED_VALUE
	 * @generated
	 * @ordered
	 */
	MSGRESOURCEEXAMPLEPROTECTED(29, "MSGRESOURCEEXAMPLEPROTECTED", "MSG_RESOURCE_EXAMPLE_PROTECTED"),

	/**
	 * The '<em><b>MSGRESOURCEIDFAIL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * unable to allocate resource id
	 * невозможно выделить идентификатор ресурса
	 * impossibile allocare l''id della risorsa
	 * nie można nadać identyfikatora zasobu
	 * impossible d'allouer l'id de la ressource
	 * kan geen resource-id reserveren
	 * 无法分配资源ID
	 * imposible encontrar el id del recurso
	 * <!-- end-model-doc -->
	 * @see #MSGRESOURCEIDFAIL_VALUE
	 * @generated
	 * @ordered
	 */
	MSGRESOURCEIDFAIL(30, "MSGRESOURCEIDFAIL", "MSG_RESOURCE_ID_FAIL"),

	/**
	 * The '<em><b>MSGRESOURCEIDMISMATCH</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Resource Id Mismatch
	 * Problème de correspondance d'Id de la Ressource
	 * Resource ID's komen niet overeen
	 * <!-- end-model-doc -->
	 * @see #MSGRESOURCEIDMISMATCH_VALUE
	 * @generated
	 * @ordered
	 */
	MSGRESOURCEIDMISMATCH(31, "MSGRESOURCEIDMISMATCH", "MSG_RESOURCE_ID_MISMATCH"),

	/**
	 * The '<em><b>MSGRESOURCEIDMISSING</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Resource Id Missing
	 * Id della Risorsa mancante
	 * Id de la Ressource manquante
	 * Resource ID ontbreekt
	 * <!-- end-model-doc -->
	 * @see #MSGRESOURCEIDMISSING_VALUE
	 * @generated
	 * @ordered
	 */
	MSGRESOURCEIDMISSING(32, "MSGRESOURCEIDMISSING", "MSG_RESOURCE_ID_MISSING"),

	/**
	 * The '<em><b>MSGRESOURCENOTALLOWED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Not allowed to submit a resource for this operation
	 * Для данной операции отправка ресурса недопустима
	 * Non è consentito sottomettere una risorsa per questa operazione
	 * Nie można zgłosić zasobu dla tej operacji
	 * Non autorisé à soumettre une ressource pour cette opération
	 * Niet toegestaan om een resource in te dienen voor deze bewerking
	 * 该操作不允许提交资源
	 * No se permite el envío de un recurso para esta operación
	 * <!-- end-model-doc -->
	 * @see #MSGRESOURCENOTALLOWED_VALUE
	 * @generated
	 * @ordered
	 */
	MSGRESOURCENOTALLOWED(33, "MSGRESOURCENOTALLOWED", "MSG_RESOURCE_NOT_ALLOWED"),

	/**
	 * The '<em><b>MSGRESOURCEREQUIRED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A resource is required
	 * Требуется ресурс
	 * E'' richiesta una risorsa
	 * Zasób jest wymagany
	 * Une ressource est requise
	 * Een resource is verplicht
	 * 必须提供一个资源
	 * Se requiere un recurso
	 * <!-- end-model-doc -->
	 * @see #MSGRESOURCEREQUIRED_VALUE
	 * @generated
	 * @ordered
	 */
	MSGRESOURCEREQUIRED(34, "MSGRESOURCEREQUIRED", "MSG_RESOURCE_REQUIRED"),

	/**
	 * The '<em><b>MSGRESOURCETYPEMISMATCH</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Resource Type Mismatch
	 * Несоответствие типа ресурса
	 * Tipo Risorsa non corrispondente
	 * Niepoprawny typ zasobu
	 * Type de ressource incorrect
	 * Verkeerd resourcetype
	 * 资源类型不匹配
	 * Los Tipos de los recursos no coinciden
	 * <!-- end-model-doc -->
	 * @see #MSGRESOURCETYPEMISMATCH_VALUE
	 * @generated
	 * @ordered
	 */
	MSGRESOURCETYPEMISMATCH(35, "MSGRESOURCETYPEMISMATCH", "MSG_RESOURCE_TYPE_MISMATCH"),

	/**
	 * The '<em><b>MSGSORTUNKNOWN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Unknown sort parameter name "%s"
	 * Неизвестное имя параметра сортировки "%s"
	 * Nome del parametro di ordinamento "%s" non riconosciuto
	 * Nieznany parametr sortowania "%s"
	 * Nom du paramètre de tri inconnu "%s"
	 * Onbekende parameternaam "%s" voor sortering
	 * 未知的排序参数名称"%s"
	 * Nombre del parámetro de ordenación "%s" desconocido
	 * <!-- end-model-doc -->
	 * @see #MSGSORTUNKNOWN_VALUE
	 * @generated
	 * @ordered
	 */
	MSGSORTUNKNOWN(36, "MSGSORTUNKNOWN", "MSG_SORT_UNKNOWN"),

	/**
	 * The '<em><b>MSGTRANSACTIONDUPLICATEID</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Duplicate Identifier in transaction: %s
	 * Дублирующий идентификатор в транзакции: %s
	 * Zdublowany identyfikator w transakcji: %s
	 * Identifiant en double dans la transaction : %s
	 * Dubbele identificatie in transactie: %s
	 * 事务中存在重复Id: %s
	 * Identificador duplicado en la transacción: %s
	 * <!-- end-model-doc -->
	 * @see #MSGTRANSACTIONDUPLICATEID_VALUE
	 * @generated
	 * @ordered
	 */
	MSGTRANSACTIONDUPLICATEID(37, "MSGTRANSACTIONDUPLICATEID", "MSG_TRANSACTION_DUPLICATE_ID"),

	/**
	 * The '<em><b>MSGTRANSACTIONMISSINGID</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Missing Identifier in transaction - an entry.id must be provided
	 * Отсутствует идентификатор в транзакции - требуется entry.id
	 * Brak identyfikatora w transakcji - należy podać entry.id
	 * Identifiant manquant dans la transaction - un élément entry.id doit être fourni
	 * Ontbrekende identificatie in transactie - entry.id is verplicht
	 * 事务中缺少Id - 必须提供一个entry.id
	 * Identificador de la transacción no encontrado - se debe proporcionar un entry.id
	 * <!-- end-model-doc -->
	 * @see #MSGTRANSACTIONMISSINGID_VALUE
	 * @generated
	 * @ordered
	 */
	MSGTRANSACTIONMISSINGID(38, "MSGTRANSACTIONMISSINGID", "MSG_TRANSACTION_MISSING_ID"),

	/**
	 * The '<em><b>MSGUNHANDLEDNODETYPE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Unhandled xml node type "%s"
	 * Не обработанный xml узел "%s"
	 * Tipo di nodo Xml non gestito "%s"
	 * Nieobsługiwany typ węzła XML "%s"
	 * Type de noeud xml "%s" non traité
	 * Kan xml nodetype "%s" niet verwerken
	 * 未处理的XML节点类型"%s"
	 * Tipo de nodo Xml no soportado "%s"
	 * <!-- end-model-doc -->
	 * @see #MSGUNHANDLEDNODETYPE_VALUE
	 * @generated
	 * @ordered
	 */
	MSGUNHANDLEDNODETYPE(39, "MSGUNHANDLEDNODETYPE", "MSG_UNHANDLED_NODE_TYPE"),

	/**
	 * The '<em><b>MSGUNKNOWNCONTENT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Unknown Content (%s) at %s
	 * Неизвестный контент (%s) в %s
	 * Contenuto Sconosciuto (%s) at %s
	 * Nieznana zawartość (%s) dla %s
	 * Contenu inconnu (%s) à %s
	 * Onbekende content (%s) at %s
	 * 未知内容 (%s) 位于 %s
	 * Contenido desconocido (%s) en %s
	 * <!-- end-model-doc -->
	 * @see #MSGUNKNOWNCONTENT_VALUE
	 * @generated
	 * @ordered
	 */
	MSGUNKNOWNCONTENT(40, "MSGUNKNOWNCONTENT", "MSG_UNKNOWN_CONTENT"),

	/**
	 * The '<em><b>MSGUNKNOWNOPERATION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * unknown FHIR http operation
	 * неизвестная операция FHIR http
	 * operazione http FHIR sconosciuta
	 * nieznana operacja FHIR http
	 * operation http FHIR inconnue
	 * onbekende FHIR http operation
	 * 未知的FHIR HTTP操作
	 * Operación http FHIR desconocida
	 * <!-- end-model-doc -->
	 * @see #MSGUNKNOWNOPERATION_VALUE
	 * @generated
	 * @ordered
	 */
	MSGUNKNOWNOPERATION(41, "MSGUNKNOWNOPERATION", "MSG_UNKNOWN_OPERATION"),

	/**
	 * The '<em><b>MSGUNKNOWNTYPE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Resource Type "%s" not recognised
	 * Тип ресурса "%s" не распознан
	 * Tipo di Risorsa "%s" non riconosciuto
	 * Nie rozpoznany typ zasobu: "%s"
	 * Type de ressource "%s" non reconnu
	 * Resourcetype "%s" niet herkend
	 * 资源类型"%s"未识别
	 * Tipo de Recurso "%s" no reconocido
	 * <!-- end-model-doc -->
	 * @see #MSGUNKNOWNTYPE_VALUE
	 * @generated
	 * @ordered
	 */
	MSGUNKNOWNTYPE(42, "MSGUNKNOWNTYPE", "MSG_UNKNOWN_TYPE"),

	/**
	 * The '<em><b>MSGUPDATED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * existing resource updated
	 * существующий ресурс обновлён
	 * risorsa esistente aggiornata
	 * uaktualniono istniejący zasób
	 * ressource existante mise à jour
	 * bestaande resource updated
	 * 已有资源被更新
	 * Recurso existente actualizado
	 * <!-- end-model-doc -->
	 * @see #MSGUPDATED_VALUE
	 * @generated
	 * @ordered
	 */
	MSGUPDATED(43, "MSGUPDATED", "MSG_UPDATED"),

	/**
	 * The '<em><b>MSGVERSIONAWARE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Version aware updates are required for this resource
	 * Для данного ресурса необходимы обновления с учётом версии
	 * Questa risorsa richiede aggiornamenti per versione
	 * Uaktualnienia zakładające wersjonowanie są wymagane dla tego zasobu
	 * Des mises à jour en relation avec la version sont requises pour cette ressource
	 * Versie-bewuste updates zijn vereist voor deze resource
	 * 该资源的更新必须针对版本
	 * Este recurso requiere actualizaciones en base a versiones
	 * <!-- end-model-doc -->
	 * @see #MSGVERSIONAWARE_VALUE
	 * @generated
	 * @ordered
	 */
	MSGVERSIONAWARE(44, "MSGVERSIONAWARE", "MSG_VERSION_AWARE"),

	/**
	 * The '<em><b>MSGVERSIONAWARECONFLICT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Update Conflict (server current version = "%s", client version referenced = "%s")
	 * Конфликт обновления (текущая версия сервера = "%s", указанная версия клиента = "%s")
	 * Conflitto nell''aggiornamento (attuale = "%s", quotato = "%s")
	 * Konflikt podczas uaktualnienia (obecna wersja na serwerze = "%s", wersja wskazana przez klienta = "%s")
	 * Conflit de mise à jour (version courante du serveur = "%s", version référencée du client = "%s")
	 * Updateconflict (huidige serverversie = "%s", opgegeven clientversie = "%s")
	 * 更新冲突 (服务器当前版本 = "%s", 客户端引用的版本 = "%s")
	 * Conflicto de actualizaciones (versión actual del servidor = "%s", versión del cliente referenciada = "%s")
	 * <!-- end-model-doc -->
	 * @see #MSGVERSIONAWARECONFLICT_VALUE
	 * @generated
	 * @ordered
	 */
	MSGVERSIONAWARECONFLICT(45, "MSGVERSIONAWARECONFLICT", "MSG_VERSION_AWARE_CONFLICT"),

	/**
	 * The '<em><b>MSGVERSIONAWAREURL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Version specific URL not recognised
	 * URL для указанной версии не распознан
	 * URL specifico alla versione non riconosciuto
	 * Nie rozpoznany URL specyficzny dla wersji
	 * URL spécifique à une version non reconnue
	 * Versie-specifieke URL niet herkend
	 * 未识别特定版本的URL
	 * URL especifica de la versión no reconocida
	 * <!-- end-model-doc -->
	 * @see #MSGVERSIONAWAREURL_VALUE
	 * @generated
	 * @ordered
	 */
	MSGVERSIONAWAREURL(46, "MSGVERSIONAWAREURL", "MSG_VERSION_AWARE_URL"),

	/**
	 * The '<em><b>MSGWRONGNS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This does not appear to be a FHIR element or resource (wrong namespace "%s")
	 * Dit lijkt geen FHIR element of resource te zijn (verkeerde namespace "%s")
	 * <!-- end-model-doc -->
	 * @see #MSGWRONGNS_VALUE
	 * @generated
	 * @ordered
	 */
	MSGWRONGNS(47, "MSGWRONGNS", "MSG_WRONG_NS"),

	/**
	 * The '<em><b>SEARCHMULTIPLE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Error: Multiple matches exist for %s search parameters "%s"
	 * Ошибка: множественные совпадения для %s с параметрами поиска "%s"
	 * Errore: Trovate corrispondenze multiple per %s parametri di ricerca "%s"
	 * Błąd: Istnieją wielokrotne dopasowania dla %s parametrów wyszukiwania "%s"
	 * Erreur : Plusieurs correspondances existent pour ce paramètre de recherche %s
	 * Fout: er is meer dan één resultaat voor %s zoekparameters "%s"
	 * 错误: 对于 %s 搜索的参数 "%s"存在多个匹配
	 * Error: Multiples ocurrencias existen para %s parametros de búsqueda "%s"
	 * <!-- end-model-doc -->
	 * @see #SEARCHMULTIPLE_VALUE
	 * @generated
	 * @ordered
	 */
	SEARCHMULTIPLE(48, "SEARCHMULTIPLE", "SEARCH_MULTIPLE"),

	/**
	 * The '<em><b>SEARCHNONE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Error: no processable search found for %s search parameters "%s"
	 * Ошибка: обрабатываемых результатов поиска для %s с параметрами поиска "%s" не найдено
	 * Errore: non è stato trovato alcun parametro di ricerca processabile per %s parametri di ricerca "%s"
	 * Błąd: Niewykonalne wyszukiwanie dla %s parametrów wyszukiwania "%s"
	 * Erreur : aucune recherche trouvée pour les paramètres %s "%s"
	 * Fout: geen verwerkbare zoekactie gevonden voor %s zoekparameters "%s"
	 * 错误: 对%s搜索参数"%s"未找到可处理的搜索
	 * Error: no se encontro una búsqueda apropiada para %s parametros de búsqueda "%s"
	 * <!-- end-model-doc -->
	 * @see #SEARCHNONE_VALUE
	 * @generated
	 * @ordered
	 */
	SEARCHNONE(49, "SEARCHNONE", "SEARCH_NONE"),

	/**
	 * The '<em><b>UPDATEMULTIPLEMATCHES</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Error: Multiple matches exist for the conditional update
	 * Fout: er is meer dan één resultaat voor de conditionele update
	 * <!-- end-model-doc -->
	 * @see #UPDATEMULTIPLEMATCHES_VALUE
	 * @generated
	 * @ordered
	 */
	UPDATEMULTIPLEMATCHES(50, "UPDATEMULTIPLEMATCHES", "UPDATE_MULTIPLE_MATCHES");

	/**
	 * The '<em><b>DELETEMULTIPLEMATCHES</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Error: Multiple matches exist for the conditional delete
	 * Fout: er is meer dan één resultaat voor de conditionele delete
	 * <!-- end-model-doc -->
	 * @see #DELETEMULTIPLEMATCHES
	 * @model literal="DELETE_MULTIPLE_MATCHES"
	 * @generated
	 * @ordered
	 */
	public static final int DELETEMULTIPLEMATCHES_VALUE = 0;

	/**
	 * The '<em><b>MSGAUTHREQUIRED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * You must authenticate before you can use this service
	 * Autenticazione richiesta prima di usare questo servizio
	 * Wymagana autentykacja przed użyciem tego serwisu
	 * Vous devez être authentifié avant de pouvoir utiliser ce service
	 * U moet zich authenticeren voor gebruik van deze service
	 * 使用此服务前需认证
	 * Debe autenticarse antes de poder usar este servicio
	 * <!-- end-model-doc -->
	 * @see #MSGAUTHREQUIRED
	 * @model literal="MSG_AUTH_REQUIRED"
	 * @generated
	 * @ordered
	 */
	public static final int MSGAUTHREQUIRED_VALUE = 1;

	/**
	 * The '<em><b>MSGBADFORMAT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Bad Syntax: "%s" must be a %s'
	 * Неверный синтакс: "%s" должен быть %s
	 * Sintassi Errata: "%s" deve essere un %s'
	 * Błąd składni: "%s" powinno być %s'
	 * Erreur de Syntaxe : "%s" doit être un %s
	 * Verkeerde syntax: "%s" moet een %s zijn
	 * 句法错误: "%s" 必须是一个 %s'
	 * Sintaxis Incorrecta: "%s" debe de ser un %s'
	 * <!-- end-model-doc -->
	 * @see #MSGBADFORMAT
	 * @model literal="MSG_BAD_FORMAT"
	 * @generated
	 * @ordered
	 */
	public static final int MSGBADFORMAT_VALUE = 2;

	/**
	 * The '<em><b>MSGBADSYNTAX</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Bad Syntax in %s
	 * Неверный синтакс: %s
	 * Sintassi errata in %s
	 * Błąd składni w %s
	 * Erreur de Syntaxe dans %s
	 * Verkeerde syntax in %s
	 * %s 中句法错误
	 * Sintaxis Incorrecta en %s
	 * <!-- end-model-doc -->
	 * @see #MSGBADSYNTAX
	 * @model literal="MSG_BAD_SYNTAX"
	 * @generated
	 * @ordered
	 */
	public static final int MSGBADSYNTAX_VALUE = 3;

	/**
	 * The '<em><b>MSGCANTPARSECONTENT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Unable to parse feed (entry content type = "%s")
	 * Impossibile effettuare il parsing del feed (tipo del contenuto della entry = "%s")
	 * Błąd parsowania (typ zawartości wejściowej = "%s")
	 * Impossible d'analyser le flux (type de contenu de l'entrée = "%s")
	 * Kan feed niet verwerken (contenttype inhoud = "%s")
	 * 无法解析feed (条目的内容类型 = "%s")
	 * No se pudo parsear el feed (el tipo de contenido de la entry = "%s")
	 * <!-- end-model-doc -->
	 * @see #MSGCANTPARSECONTENT
	 * @model literal="MSG_CANT_PARSE_CONTENT"
	 * @generated
	 * @ordered
	 */
	public static final int MSGCANTPARSECONTENT_VALUE = 4;

	/**
	 * The '<em><b>MSGCANTPARSEROOT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Unable to parse feed (root element name = "%s")
	 * Не удалось разобрать данные (корневой элемент = "%s")
	 * Impossibile effettuare il parsing del feed (nome elemento root = "%s")
	 * Błąd parsowania (nazwa elementu root = "%s")
	 * Impossible d'analyser le flux (nom de l'élément racine = "%s")
	 * Kan feed niet verwerken (rootelementnaam = "%s")
	 * 无法解析feed (根元素名 = "%s")
	 * No se pudo parsear el feed (nombre del elemento raiz = "%s")
	 * <!-- end-model-doc -->
	 * @see #MSGCANTPARSEROOT
	 * @model literal="MSG_CANT_PARSE_ROOT"
	 * @generated
	 * @ordered
	 */
	public static final int MSGCANTPARSEROOT_VALUE = 5;

	/**
	 * The '<em><b>MSGCREATED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * New resource created
	 * Nieuwe resource gemaakt
	 * <!-- end-model-doc -->
	 * @see #MSGCREATED
	 * @model literal="MSG_CREATED"
	 * @generated
	 * @ordered
	 */
	public static final int MSGCREATED_VALUE = 6;

	/**
	 * The '<em><b>MSGDATEFORMAT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Date value %s is not in the correct format (Xml Date Format required)
	 * Значение Date %s в неверном формате (требуется Xml Date формат)
	 * Il valore %s per la data non è nel formato corretto (richiesto il Formato Data Xml)
	 * Niepoprawny format wartości daty %s (wymagany format XML)
	 * Le format de la date %s est incorrect (format Date Xml attendu)
	 * De Datum-waarde %s heeft niet de juiste structuur (Xml Date vereist)
	 * 日期的值 %s 格式不正确 (要求是Xml Date格式)
	 * El valor de la fecha %s no está en el formato correcto (se requiere un formato de fecha Xml)
	 * <!-- end-model-doc -->
	 * @see #MSGDATEFORMAT
	 * @model literal="MSG_DATE_FORMAT"
	 * @generated
	 * @ordered
	 */
	public static final int MSGDATEFORMAT_VALUE = 7;

	/**
	 * The '<em><b>MSGDELETED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This resource has been deleted
	 * Данный ресурс был удалён
	 * Questa risorsa è stata cancellata
	 * Ten zasób został usunięty
	 * La ressource a été supprimée
	 * Deze resource is verwijderd
	 * 该资源已删除
	 * Este recurso ha sido borrado
	 * <!-- end-model-doc -->
	 * @see #MSGDELETED
	 * @model literal="MSG_DELETED"
	 * @generated
	 * @ordered
	 */
	public static final int MSGDELETED_VALUE = 8;

	/**
	 * The '<em><b>MSGDELETEDDONE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Resource deleted
	 * Ресурс удалён
	 * Risorsa cancellata
	 * Zasób usunięto
	 * Ressource supprimée
	 * Resource verwijderd
	 * 资源已删除
	 * Recurso borrado
	 * <!-- end-model-doc -->
	 * @see #MSGDELETEDDONE
	 * @model literal="MSG_DELETED_DONE"
	 * @generated
	 * @ordered
	 */
	public static final int MSGDELETEDDONE_VALUE = 9;

	/**
	 * The '<em><b>MSGDELETEDID</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The resource "%s" has been deleted
	 * Ресурс "%s" был удалён
	 * La risorsa "%s" è stata eliminata
	 * Zasób "%s" został usunięty
	 * La ressource "%s" a été supprimée
	 * De resource "%s" is verwijderd
	 * 资源 "%s" 已被删除
	 * El recurso "%s" ha sido borrado
	 * <!-- end-model-doc -->
	 * @see #MSGDELETEDID
	 * @model literal="MSG_DELETED_ID"
	 * @generated
	 * @ordered
	 */
	public static final int MSGDELETEDID_VALUE = 10;

	/**
	 * The '<em><b>MSGDUPLICATEID</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Duplicate Id %s for resource type %s
	 * Дублирующий Id %s для типа ресурса %s
	 * Id %s duplicato per il tipo di risorsa %s
	 * Zdublowany identyfikator %s dla zasobu typu %s
	 * Id %s en double pour le type de ressource %s
	 * Duplicaat-id %s voor resourcetype %s
	 * ID %s 重复（资源类型 %s）
	 * Id %s duplicada para el recurso de tipo %s
	 * <!-- end-model-doc -->
	 * @see #MSGDUPLICATEID
	 * @model literal="MSG_DUPLICATE_ID"
	 * @generated
	 * @ordered
	 */
	public static final int MSGDUPLICATEID_VALUE = 11;

	/**
	 * The '<em><b>MSGERRORPARSING</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Error parsing resource Xml (%s)
	 * Ошибка синтаксического разбора ресурса Xml (%s)
	 * Errore nel parsing della risorsa Xml (%s)
	 * Błąd w trakcie parsowania zasobu XML (%s)
	 * Erreur d'analyse de la ressource Xml (%s)
	 * Fout in verwerking resource Xml (%s)
	 * 解析资源Xml时出错 (%s)
	 * Error parseando el recurso Xml (%s)
	 * <!-- end-model-doc -->
	 * @see #MSGERRORPARSING
	 * @model literal="MSG_ERROR_PARSING"
	 * @generated
	 * @ordered
	 */
	public static final int MSGERRORPARSING_VALUE = 12;

	/**
	 * The '<em><b>MSGIDINVALID</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Id "%s" has an invalid character "%s"
	 * Id "%s" содержит недопустимые символы "%s"
	 * L''Id "%s" ha un carattere non valido: "%s"
	 * Identyfikator "%s" zawiera niepoprawny znak "%s"
	 * Id "%s" possède un caractère invalide "%s"
	 * Id "%s" heeft een ongeldig teken "%s"
	 * ID "%s" 带有非法字符: "%s"
	 * El Id "%s" contiene el caracter inválido "%s"
	 * <!-- end-model-doc -->
	 * @see #MSGIDINVALID
	 * @model literal="MSG_ID_INVALID"
	 * @generated
	 * @ordered
	 */
	public static final int MSGIDINVALID_VALUE = 13;

	/**
	 * The '<em><b>MSGIDTOOLONG</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Id "%s" too long (length limit 36)
	 * Недопустимая длина Id "%s" (ограничение 36)
	 * Id "%s" troppo lunga (limite di lunghezza: 36)
	 * Identyfikator "%s" jest zbyt długi (limit długości 36)
	 * Id "%s" trop long (la longueur limite est 36)
	 * Id "%s" te lang (max lengte 36)
	 * Id "%s" 过长 (长度限制: 36)
	 * El Id "%s" es demasiado largo (limite de longitud: 36)
	 * <!-- end-model-doc -->
	 * @see #MSGIDTOOLONG
	 * @model literal="MSG_ID_TOO_LONG"
	 * @generated
	 * @ordered
	 */
	public static final int MSGIDTOOLONG_VALUE = 14;

	/**
	 * The '<em><b>MSGINVALIDID</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Id not accepted
	 * Id не принято
	 * Id non accettato
	 * Identyfikator nie zaakceptowany
	 * Id non accepté
	 * Id niet geaccepteerd
	 * Id不被接受
	 * Id no aceptada
	 * <!-- end-model-doc -->
	 * @see #MSGINVALIDID
	 * @model literal="MSG_INVALID_ID"
	 * @generated
	 * @ordered
	 */
	public static final int MSGINVALIDID_VALUE = 15;

	/**
	 * The '<em><b>MSGJSONOBJECT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Json Source for a resource should start with an object
	 * Json Source для ресурса должен начинаться с объекта
	 * Il sorgente Json di una risorsa dovrebbe iniziare con un oggetto
	 * Źródło json dla zasobu powinno rozpoczynać się od obiektu
	 * La source Json pour une ressource doit commencer par un objet
	 * Json Source van een resource moeten beginnen met een object
	 * 资源的Json源应以一个object开始
	 * La fuente Json para un recurso debería empezar con un objeto
	 * <!-- end-model-doc -->
	 * @see #MSGJSONOBJECT
	 * @model literal="MSG_JSON_OBJECT"
	 * @generated
	 * @ordered
	 */
	public static final int MSGJSONOBJECT_VALUE = 16;

	/**
	 * The '<em><b>MSGLOCALFAIL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Unable to resolve local reference to resource %s
	 * Невозможно определить локальную ссылку на ресурс %s
	 * Impossibile risolvere il riferimento locale alla risorsa %s
	 * Zasób wskazywany przez loklaną referencję %s nie został odnaleziony
	 * Impossible de résourdre la référence locale à la ressource %s
	 * De resource met lokale referentie %s is niet gevonden
	 * 无法解析对资源 %s 的本地引用
	 * Imposible resolver la referencia al recurso %s
	 * <!-- end-model-doc -->
	 * @see #MSGLOCALFAIL
	 * @model literal="MSG_LOCAL_FAIL"
	 * @generated
	 * @ordered
	 */
	public static final int MSGLOCALFAIL_VALUE = 17;

	/**
	 * The '<em><b>MSGNOEXIST</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Resource Id "%s" does not exist
	 * Ресурс Id "%s" не существует
	 * La risorsa con Id "%s" non esiste
	 * Zasób o identyfikatorze "%s" nie istnieje
	 * La ressource avec l'Id "%s" n'existe pas
	 * Resource-id "%s" bestaat niet
	 * 资源Id "%s"不存在
	 * El recurso con Id "%s" no existe
	 * <!-- end-model-doc -->
	 * @see #MSGNOEXIST
	 * @model literal="MSG_NO_EXIST"
	 * @generated
	 * @ordered
	 */
	public static final int MSGNOEXIST_VALUE = 18;

	/**
	 * The '<em><b>MSGNOMATCH</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * No Resource found matching the query "%s"
	 * Nessuna Risorsa soddisfa la query "%s"
	 * Geen resource gevonden met query "%s"
	 * <!-- end-model-doc -->
	 * @see #MSGNOMATCH
	 * @model literal="MSG_NO_MATCH"
	 * @generated
	 * @ordered
	 */
	public static final int MSGNOMATCH_VALUE = 19;

	/**
	 * The '<em><b>MSGNOMODULE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * No module could be found to handle the request "%s"
	 * Модуль для обработки запроса "%s" не найден
	 * Impossibile trovare un modulo per gestire la richiesta "%s"
	 * Nie można odnaleźć modułu, aby obsłużyć żądanie "%s"
	 * Aucun module disponible pour traiter la requête "%s"
	 * Er kon geen module worden gevonden om verzoek "%s" te verwerken
	 * 无法找到处理请求"%s"的模块
	 * No se encontró un modulo que gestione la petición "%s"
	 * <!-- end-model-doc -->
	 * @see #MSGNOMODULE
	 * @model literal="MSG_NO_MODULE"
	 * @generated
	 * @ordered
	 */
	public static final int MSGNOMODULE_VALUE = 20;

	/**
	 * The '<em><b>MSGNOSUMMARY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * No Summary for this resource
	 * Отсутствует Summary для данного ресурса
	 * Nessun riepilogo per questa risorsa
	 * Brak podsumowania (Summary) dla tego zasobu
	 * Aucun résumé disponible pour cette ressource
	 * Geen samenvatting voor deze resource
	 * 该资源无summary
	 * No existe un resumen para este recurso
	 * <!-- end-model-doc -->
	 * @see #MSGNOSUMMARY
	 * @model literal="MSG_NO_SUMMARY"
	 * @generated
	 * @ordered
	 */
	public static final int MSGNOSUMMARY_VALUE = 21;

	/**
	 * The '<em><b>MSGOPNOTALLOWED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Operation %s not allowed for resource %s (due to local configuration)
	 * Операция %s недопустима для ресурса %s (по причине локальной конфигурации)
	 * Operazione %s non consentita per la risorsa %s (a causa di configurazioni locali)
	 * Niedozwolona operacja %s dla zasobu %s (ze względu na lokalną konfigurację)
	 * L'opération %s n'est pas permise pour la ressource %s (à cause de la configuration locale)
	 * Bewerking %s niet toegestaan voor resource %s (vanwege lokale configuratie)
	 * 操作 %s 不允许，对于资源 %s (由于本地配置)
	 * Operación %s no permitida para el recurso %s (debido a la configuración local)
	 * <!-- end-model-doc -->
	 * @see #MSGOPNOTALLOWED
	 * @model literal="MSG_OP_NOT_ALLOWED"
	 * @generated
	 * @ordered
	 */
	public static final int MSGOPNOTALLOWED_VALUE = 22;

	/**
	 * The '<em><b>MSGPARAMCHAINED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Unknown chained parameter name "%s"
	 * Неизвестое вложенное наименование параметра "%s"
	 * Nome di parametro concatenato sconosciuto: "%s"
	 * Nieznana nazwa parametru powiązanego "%s"
	 * Nom du paramètre chainé inconnu : "%s"
	 * Onbekende geschakelde parameternaam "%s"
	 * 未知的链式参数名: "%s"
	 * Nombre de parametro encadenado desconocido: "%s"
	 * <!-- end-model-doc -->
	 * @see #MSGPARAMCHAINED
	 * @model literal="MSG_PARAM_CHAINED"
	 * @generated
	 * @ordered
	 */
	public static final int MSGPARAMCHAINED_VALUE = 23;

	/**
	 * The '<em><b>MSGPARAMINVALID</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Parameter "%s" content is invalid
	 * Il contenuto del Parametro "%s" non è valido
	 * Waarde van parameter "%s" is ongeldig
	 * <!-- end-model-doc -->
	 * @see #MSGPARAMINVALID
	 * @model literal="MSG_PARAM_INVALID"
	 * @generated
	 * @ordered
	 */
	public static final int MSGPARAMINVALID_VALUE = 24;

	/**
	 * The '<em><b>MSGPARAMMODIFIERINVALID</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Parameter "%s" modifier is invalid
	 * Modifier van parameter "%s" is ongeldig
	 * <!-- end-model-doc -->
	 * @see #MSGPARAMMODIFIERINVALID
	 * @model literal="MSG_PARAM_MODIFIER_INVALID"
	 * @generated
	 * @ordered
	 */
	public static final int MSGPARAMMODIFIERINVALID_VALUE = 25;

	/**
	 * The '<em><b>MSGPARAMNOREPEAT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Parameter "%s" is not allowed to repeat
	 * Параметр "%s" не может быть повторён
	 * Non � consentito ripetere il parametro "%s"
	 * Parametr "%s" nie może zostać powtórzony
	 * Le paramètre "%s" ne peut pas être répété
	 * Parameter "%s" mag niet herhalen
	 * 参数"%s"不可重复
	 * No se permite la repetición del parámetro "%s"
	 * <!-- end-model-doc -->
	 * @see #MSGPARAMNOREPEAT
	 * @model literal="MSG_PARAM_NO_REPEAT"
	 * @generated
	 * @ordered
	 */
	public static final int MSGPARAMNOREPEAT_VALUE = 26;

	/**
	 * The '<em><b>MSGPARAMUNKNOWN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Parameter "%s" not understood
	 * Параметр "%s" не понят
	 * Parametro "%s" non riconosciuto
	 * Niezrozumiały parametr "%s"
	 * Paramètre "%s" non reconnu
	 * Parameter "%s" onbekend
	 * 无法理解参数"%s"
	 * Parámetro "%s" no reconocido
	 * <!-- end-model-doc -->
	 * @see #MSGPARAMUNKNOWN
	 * @model literal="MSG_PARAM_UNKNOWN"
	 * @generated
	 * @ordered
	 */
	public static final int MSGPARAMUNKNOWN_VALUE = 27;

	/**
	 * The '<em><b>MSGREMOTEFAIL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Unable to resolve local reference to resource %s
	 * <!-- end-model-doc -->
	 * @see #MSGREMOTEFAIL
	 * @model literal="MSG_REMOTE_FAIL"
	 * @generated
	 * @ordered
	 */
	public static final int MSGREMOTEFAIL_VALUE = 28;

	/**
	 * The '<em><b>MSGRESOURCEEXAMPLEPROTECTED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Resources with identity "example" cannot be deleted (for testing/training purposes)
	 * Ресурс с идентификатором "example" не может быть удалён (для случаев тестирования/обучения)
	 * Le Risorse aventi l'identità "example" non possono essere cancellate (per finalità di test/formazione)
	 * Zasoby oznaczone jako "example" nie mogą zostać usunięte (dla celów testów/szkoleń)
	 * Les ressources ayant l'identité "example" ne peuvent pas être supprimées (utilisées pour les tests/formations)
	 * Resources met identiteit "voorbeeld" kunnen niet worden verwijderd (ten behoeve van testen/training)
	 * 以"example" 为ID的资源不能被删除 (用于测试/培训)
	 * Recursos con la identidad "example" no pueden ser borrados (son usados para pruebas/entrenamiento)
	 * <!-- end-model-doc -->
	 * @see #MSGRESOURCEEXAMPLEPROTECTED
	 * @model literal="MSG_RESOURCE_EXAMPLE_PROTECTED"
	 * @generated
	 * @ordered
	 */
	public static final int MSGRESOURCEEXAMPLEPROTECTED_VALUE = 29;

	/**
	 * The '<em><b>MSGRESOURCEIDFAIL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * unable to allocate resource id
	 * невозможно выделить идентификатор ресурса
	 * impossibile allocare l''id della risorsa
	 * nie można nadać identyfikatora zasobu
	 * impossible d'allouer l'id de la ressource
	 * kan geen resource-id reserveren
	 * 无法分配资源ID
	 * imposible encontrar el id del recurso
	 * <!-- end-model-doc -->
	 * @see #MSGRESOURCEIDFAIL
	 * @model literal="MSG_RESOURCE_ID_FAIL"
	 * @generated
	 * @ordered
	 */
	public static final int MSGRESOURCEIDFAIL_VALUE = 30;

	/**
	 * The '<em><b>MSGRESOURCEIDMISMATCH</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Resource Id Mismatch
	 * Problème de correspondance d'Id de la Ressource
	 * Resource ID's komen niet overeen
	 * <!-- end-model-doc -->
	 * @see #MSGRESOURCEIDMISMATCH
	 * @model literal="MSG_RESOURCE_ID_MISMATCH"
	 * @generated
	 * @ordered
	 */
	public static final int MSGRESOURCEIDMISMATCH_VALUE = 31;

	/**
	 * The '<em><b>MSGRESOURCEIDMISSING</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Resource Id Missing
	 * Id della Risorsa mancante
	 * Id de la Ressource manquante
	 * Resource ID ontbreekt
	 * <!-- end-model-doc -->
	 * @see #MSGRESOURCEIDMISSING
	 * @model literal="MSG_RESOURCE_ID_MISSING"
	 * @generated
	 * @ordered
	 */
	public static final int MSGRESOURCEIDMISSING_VALUE = 32;

	/**
	 * The '<em><b>MSGRESOURCENOTALLOWED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Not allowed to submit a resource for this operation
	 * Для данной операции отправка ресурса недопустима
	 * Non è consentito sottomettere una risorsa per questa operazione
	 * Nie można zgłosić zasobu dla tej operacji
	 * Non autorisé à soumettre une ressource pour cette opération
	 * Niet toegestaan om een resource in te dienen voor deze bewerking
	 * 该操作不允许提交资源
	 * No se permite el envío de un recurso para esta operación
	 * <!-- end-model-doc -->
	 * @see #MSGRESOURCENOTALLOWED
	 * @model literal="MSG_RESOURCE_NOT_ALLOWED"
	 * @generated
	 * @ordered
	 */
	public static final int MSGRESOURCENOTALLOWED_VALUE = 33;

	/**
	 * The '<em><b>MSGRESOURCEREQUIRED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A resource is required
	 * Требуется ресурс
	 * E'' richiesta una risorsa
	 * Zasób jest wymagany
	 * Une ressource est requise
	 * Een resource is verplicht
	 * 必须提供一个资源
	 * Se requiere un recurso
	 * <!-- end-model-doc -->
	 * @see #MSGRESOURCEREQUIRED
	 * @model literal="MSG_RESOURCE_REQUIRED"
	 * @generated
	 * @ordered
	 */
	public static final int MSGRESOURCEREQUIRED_VALUE = 34;

	/**
	 * The '<em><b>MSGRESOURCETYPEMISMATCH</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Resource Type Mismatch
	 * Несоответствие типа ресурса
	 * Tipo Risorsa non corrispondente
	 * Niepoprawny typ zasobu
	 * Type de ressource incorrect
	 * Verkeerd resourcetype
	 * 资源类型不匹配
	 * Los Tipos de los recursos no coinciden
	 * <!-- end-model-doc -->
	 * @see #MSGRESOURCETYPEMISMATCH
	 * @model literal="MSG_RESOURCE_TYPE_MISMATCH"
	 * @generated
	 * @ordered
	 */
	public static final int MSGRESOURCETYPEMISMATCH_VALUE = 35;

	/**
	 * The '<em><b>MSGSORTUNKNOWN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Unknown sort parameter name "%s"
	 * Неизвестное имя параметра сортировки "%s"
	 * Nome del parametro di ordinamento "%s" non riconosciuto
	 * Nieznany parametr sortowania "%s"
	 * Nom du paramètre de tri inconnu "%s"
	 * Onbekende parameternaam "%s" voor sortering
	 * 未知的排序参数名称"%s"
	 * Nombre del parámetro de ordenación "%s" desconocido
	 * <!-- end-model-doc -->
	 * @see #MSGSORTUNKNOWN
	 * @model literal="MSG_SORT_UNKNOWN"
	 * @generated
	 * @ordered
	 */
	public static final int MSGSORTUNKNOWN_VALUE = 36;

	/**
	 * The '<em><b>MSGTRANSACTIONDUPLICATEID</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Duplicate Identifier in transaction: %s
	 * Дублирующий идентификатор в транзакции: %s
	 * Zdublowany identyfikator w transakcji: %s
	 * Identifiant en double dans la transaction : %s
	 * Dubbele identificatie in transactie: %s
	 * 事务中存在重复Id: %s
	 * Identificador duplicado en la transacción: %s
	 * <!-- end-model-doc -->
	 * @see #MSGTRANSACTIONDUPLICATEID
	 * @model literal="MSG_TRANSACTION_DUPLICATE_ID"
	 * @generated
	 * @ordered
	 */
	public static final int MSGTRANSACTIONDUPLICATEID_VALUE = 37;

	/**
	 * The '<em><b>MSGTRANSACTIONMISSINGID</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Missing Identifier in transaction - an entry.id must be provided
	 * Отсутствует идентификатор в транзакции - требуется entry.id
	 * Brak identyfikatora w transakcji - należy podać entry.id
	 * Identifiant manquant dans la transaction - un élément entry.id doit être fourni
	 * Ontbrekende identificatie in transactie - entry.id is verplicht
	 * 事务中缺少Id - 必须提供一个entry.id
	 * Identificador de la transacción no encontrado - se debe proporcionar un entry.id
	 * <!-- end-model-doc -->
	 * @see #MSGTRANSACTIONMISSINGID
	 * @model literal="MSG_TRANSACTION_MISSING_ID"
	 * @generated
	 * @ordered
	 */
	public static final int MSGTRANSACTIONMISSINGID_VALUE = 38;

	/**
	 * The '<em><b>MSGUNHANDLEDNODETYPE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Unhandled xml node type "%s"
	 * Не обработанный xml узел "%s"
	 * Tipo di nodo Xml non gestito "%s"
	 * Nieobsługiwany typ węzła XML "%s"
	 * Type de noeud xml "%s" non traité
	 * Kan xml nodetype "%s" niet verwerken
	 * 未处理的XML节点类型"%s"
	 * Tipo de nodo Xml no soportado "%s"
	 * <!-- end-model-doc -->
	 * @see #MSGUNHANDLEDNODETYPE
	 * @model literal="MSG_UNHANDLED_NODE_TYPE"
	 * @generated
	 * @ordered
	 */
	public static final int MSGUNHANDLEDNODETYPE_VALUE = 39;

	/**
	 * The '<em><b>MSGUNKNOWNCONTENT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Unknown Content (%s) at %s
	 * Неизвестный контент (%s) в %s
	 * Contenuto Sconosciuto (%s) at %s
	 * Nieznana zawartość (%s) dla %s
	 * Contenu inconnu (%s) à %s
	 * Onbekende content (%s) at %s
	 * 未知内容 (%s) 位于 %s
	 * Contenido desconocido (%s) en %s
	 * <!-- end-model-doc -->
	 * @see #MSGUNKNOWNCONTENT
	 * @model literal="MSG_UNKNOWN_CONTENT"
	 * @generated
	 * @ordered
	 */
	public static final int MSGUNKNOWNCONTENT_VALUE = 40;

	/**
	 * The '<em><b>MSGUNKNOWNOPERATION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * unknown FHIR http operation
	 * неизвестная операция FHIR http
	 * operazione http FHIR sconosciuta
	 * nieznana operacja FHIR http
	 * operation http FHIR inconnue
	 * onbekende FHIR http operation
	 * 未知的FHIR HTTP操作
	 * Operación http FHIR desconocida
	 * <!-- end-model-doc -->
	 * @see #MSGUNKNOWNOPERATION
	 * @model literal="MSG_UNKNOWN_OPERATION"
	 * @generated
	 * @ordered
	 */
	public static final int MSGUNKNOWNOPERATION_VALUE = 41;

	/**
	 * The '<em><b>MSGUNKNOWNTYPE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Resource Type "%s" not recognised
	 * Тип ресурса "%s" не распознан
	 * Tipo di Risorsa "%s" non riconosciuto
	 * Nie rozpoznany typ zasobu: "%s"
	 * Type de ressource "%s" non reconnu
	 * Resourcetype "%s" niet herkend
	 * 资源类型"%s"未识别
	 * Tipo de Recurso "%s" no reconocido
	 * <!-- end-model-doc -->
	 * @see #MSGUNKNOWNTYPE
	 * @model literal="MSG_UNKNOWN_TYPE"
	 * @generated
	 * @ordered
	 */
	public static final int MSGUNKNOWNTYPE_VALUE = 42;

	/**
	 * The '<em><b>MSGUPDATED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * existing resource updated
	 * существующий ресурс обновлён
	 * risorsa esistente aggiornata
	 * uaktualniono istniejący zasób
	 * ressource existante mise à jour
	 * bestaande resource updated
	 * 已有资源被更新
	 * Recurso existente actualizado
	 * <!-- end-model-doc -->
	 * @see #MSGUPDATED
	 * @model literal="MSG_UPDATED"
	 * @generated
	 * @ordered
	 */
	public static final int MSGUPDATED_VALUE = 43;

	/**
	 * The '<em><b>MSGVERSIONAWARE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Version aware updates are required for this resource
	 * Для данного ресурса необходимы обновления с учётом версии
	 * Questa risorsa richiede aggiornamenti per versione
	 * Uaktualnienia zakładające wersjonowanie są wymagane dla tego zasobu
	 * Des mises à jour en relation avec la version sont requises pour cette ressource
	 * Versie-bewuste updates zijn vereist voor deze resource
	 * 该资源的更新必须针对版本
	 * Este recurso requiere actualizaciones en base a versiones
	 * <!-- end-model-doc -->
	 * @see #MSGVERSIONAWARE
	 * @model literal="MSG_VERSION_AWARE"
	 * @generated
	 * @ordered
	 */
	public static final int MSGVERSIONAWARE_VALUE = 44;

	/**
	 * The '<em><b>MSGVERSIONAWARECONFLICT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Update Conflict (server current version = "%s", client version referenced = "%s")
	 * Конфликт обновления (текущая версия сервера = "%s", указанная версия клиента = "%s")
	 * Conflitto nell''aggiornamento (attuale = "%s", quotato = "%s")
	 * Konflikt podczas uaktualnienia (obecna wersja na serwerze = "%s", wersja wskazana przez klienta = "%s")
	 * Conflit de mise à jour (version courante du serveur = "%s", version référencée du client = "%s")
	 * Updateconflict (huidige serverversie = "%s", opgegeven clientversie = "%s")
	 * 更新冲突 (服务器当前版本 = "%s", 客户端引用的版本 = "%s")
	 * Conflicto de actualizaciones (versión actual del servidor = "%s", versión del cliente referenciada = "%s")
	 * <!-- end-model-doc -->
	 * @see #MSGVERSIONAWARECONFLICT
	 * @model literal="MSG_VERSION_AWARE_CONFLICT"
	 * @generated
	 * @ordered
	 */
	public static final int MSGVERSIONAWARECONFLICT_VALUE = 45;

	/**
	 * The '<em><b>MSGVERSIONAWAREURL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Version specific URL not recognised
	 * URL для указанной версии не распознан
	 * URL specifico alla versione non riconosciuto
	 * Nie rozpoznany URL specyficzny dla wersji
	 * URL spécifique à une version non reconnue
	 * Versie-specifieke URL niet herkend
	 * 未识别特定版本的URL
	 * URL especifica de la versión no reconocida
	 * <!-- end-model-doc -->
	 * @see #MSGVERSIONAWAREURL
	 * @model literal="MSG_VERSION_AWARE_URL"
	 * @generated
	 * @ordered
	 */
	public static final int MSGVERSIONAWAREURL_VALUE = 46;

	/**
	 * The '<em><b>MSGWRONGNS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This does not appear to be a FHIR element or resource (wrong namespace "%s")
	 * Dit lijkt geen FHIR element of resource te zijn (verkeerde namespace "%s")
	 * <!-- end-model-doc -->
	 * @see #MSGWRONGNS
	 * @model literal="MSG_WRONG_NS"
	 * @generated
	 * @ordered
	 */
	public static final int MSGWRONGNS_VALUE = 47;

	/**
	 * The '<em><b>SEARCHMULTIPLE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Error: Multiple matches exist for %s search parameters "%s"
	 * Ошибка: множественные совпадения для %s с параметрами поиска "%s"
	 * Errore: Trovate corrispondenze multiple per %s parametri di ricerca "%s"
	 * Błąd: Istnieją wielokrotne dopasowania dla %s parametrów wyszukiwania "%s"
	 * Erreur : Plusieurs correspondances existent pour ce paramètre de recherche %s
	 * Fout: er is meer dan één resultaat voor %s zoekparameters "%s"
	 * 错误: 对于 %s 搜索的参数 "%s"存在多个匹配
	 * Error: Multiples ocurrencias existen para %s parametros de búsqueda "%s"
	 * <!-- end-model-doc -->
	 * @see #SEARCHMULTIPLE
	 * @model literal="SEARCH_MULTIPLE"
	 * @generated
	 * @ordered
	 */
	public static final int SEARCHMULTIPLE_VALUE = 48;

	/**
	 * The '<em><b>SEARCHNONE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Error: no processable search found for %s search parameters "%s"
	 * Ошибка: обрабатываемых результатов поиска для %s с параметрами поиска "%s" не найдено
	 * Errore: non è stato trovato alcun parametro di ricerca processabile per %s parametri di ricerca "%s"
	 * Błąd: Niewykonalne wyszukiwanie dla %s parametrów wyszukiwania "%s"
	 * Erreur : aucune recherche trouvée pour les paramètres %s "%s"
	 * Fout: geen verwerkbare zoekactie gevonden voor %s zoekparameters "%s"
	 * 错误: 对%s搜索参数"%s"未找到可处理的搜索
	 * Error: no se encontro una búsqueda apropiada para %s parametros de búsqueda "%s"
	 * <!-- end-model-doc -->
	 * @see #SEARCHNONE
	 * @model literal="SEARCH_NONE"
	 * @generated
	 * @ordered
	 */
	public static final int SEARCHNONE_VALUE = 49;

	/**
	 * The '<em><b>UPDATEMULTIPLEMATCHES</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Error: Multiple matches exist for the conditional update
	 * Fout: er is meer dan één resultaat voor de conditionele update
	 * <!-- end-model-doc -->
	 * @see #UPDATEMULTIPLEMATCHES
	 * @model literal="UPDATE_MULTIPLE_MATCHES"
	 * @generated
	 * @ordered
	 */
	public static final int UPDATEMULTIPLEMATCHES_VALUE = 50;

	/**
	 * An array of all the '<em><b>Operation Outcome Codes Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final OperationOutcomeCodesEnum[] VALUES_ARRAY =
		new OperationOutcomeCodesEnum[] {
			DELETEMULTIPLEMATCHES,
			MSGAUTHREQUIRED,
			MSGBADFORMAT,
			MSGBADSYNTAX,
			MSGCANTPARSECONTENT,
			MSGCANTPARSEROOT,
			MSGCREATED,
			MSGDATEFORMAT,
			MSGDELETED,
			MSGDELETEDDONE,
			MSGDELETEDID,
			MSGDUPLICATEID,
			MSGERRORPARSING,
			MSGIDINVALID,
			MSGIDTOOLONG,
			MSGINVALIDID,
			MSGJSONOBJECT,
			MSGLOCALFAIL,
			MSGNOEXIST,
			MSGNOMATCH,
			MSGNOMODULE,
			MSGNOSUMMARY,
			MSGOPNOTALLOWED,
			MSGPARAMCHAINED,
			MSGPARAMINVALID,
			MSGPARAMMODIFIERINVALID,
			MSGPARAMNOREPEAT,
			MSGPARAMUNKNOWN,
			MSGREMOTEFAIL,
			MSGRESOURCEEXAMPLEPROTECTED,
			MSGRESOURCEIDFAIL,
			MSGRESOURCEIDMISMATCH,
			MSGRESOURCEIDMISSING,
			MSGRESOURCENOTALLOWED,
			MSGRESOURCEREQUIRED,
			MSGRESOURCETYPEMISMATCH,
			MSGSORTUNKNOWN,
			MSGTRANSACTIONDUPLICATEID,
			MSGTRANSACTIONMISSINGID,
			MSGUNHANDLEDNODETYPE,
			MSGUNKNOWNCONTENT,
			MSGUNKNOWNOPERATION,
			MSGUNKNOWNTYPE,
			MSGUPDATED,
			MSGVERSIONAWARE,
			MSGVERSIONAWARECONFLICT,
			MSGVERSIONAWAREURL,
			MSGWRONGNS,
			SEARCHMULTIPLE,
			SEARCHNONE,
			UPDATEMULTIPLEMATCHES,
		};

	/**
	 * A public read-only list of all the '<em><b>Operation Outcome Codes Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<OperationOutcomeCodesEnum> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Operation Outcome Codes Enum</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static OperationOutcomeCodesEnum get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			OperationOutcomeCodesEnum result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Operation Outcome Codes Enum</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static OperationOutcomeCodesEnum getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			OperationOutcomeCodesEnum result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Operation Outcome Codes Enum</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static OperationOutcomeCodesEnum get(int value) {
		switch (value) {
			case DELETEMULTIPLEMATCHES_VALUE: return DELETEMULTIPLEMATCHES;
			case MSGAUTHREQUIRED_VALUE: return MSGAUTHREQUIRED;
			case MSGBADFORMAT_VALUE: return MSGBADFORMAT;
			case MSGBADSYNTAX_VALUE: return MSGBADSYNTAX;
			case MSGCANTPARSECONTENT_VALUE: return MSGCANTPARSECONTENT;
			case MSGCANTPARSEROOT_VALUE: return MSGCANTPARSEROOT;
			case MSGCREATED_VALUE: return MSGCREATED;
			case MSGDATEFORMAT_VALUE: return MSGDATEFORMAT;
			case MSGDELETED_VALUE: return MSGDELETED;
			case MSGDELETEDDONE_VALUE: return MSGDELETEDDONE;
			case MSGDELETEDID_VALUE: return MSGDELETEDID;
			case MSGDUPLICATEID_VALUE: return MSGDUPLICATEID;
			case MSGERRORPARSING_VALUE: return MSGERRORPARSING;
			case MSGIDINVALID_VALUE: return MSGIDINVALID;
			case MSGIDTOOLONG_VALUE: return MSGIDTOOLONG;
			case MSGINVALIDID_VALUE: return MSGINVALIDID;
			case MSGJSONOBJECT_VALUE: return MSGJSONOBJECT;
			case MSGLOCALFAIL_VALUE: return MSGLOCALFAIL;
			case MSGNOEXIST_VALUE: return MSGNOEXIST;
			case MSGNOMATCH_VALUE: return MSGNOMATCH;
			case MSGNOMODULE_VALUE: return MSGNOMODULE;
			case MSGNOSUMMARY_VALUE: return MSGNOSUMMARY;
			case MSGOPNOTALLOWED_VALUE: return MSGOPNOTALLOWED;
			case MSGPARAMCHAINED_VALUE: return MSGPARAMCHAINED;
			case MSGPARAMINVALID_VALUE: return MSGPARAMINVALID;
			case MSGPARAMMODIFIERINVALID_VALUE: return MSGPARAMMODIFIERINVALID;
			case MSGPARAMNOREPEAT_VALUE: return MSGPARAMNOREPEAT;
			case MSGPARAMUNKNOWN_VALUE: return MSGPARAMUNKNOWN;
			case MSGREMOTEFAIL_VALUE: return MSGREMOTEFAIL;
			case MSGRESOURCEEXAMPLEPROTECTED_VALUE: return MSGRESOURCEEXAMPLEPROTECTED;
			case MSGRESOURCEIDFAIL_VALUE: return MSGRESOURCEIDFAIL;
			case MSGRESOURCEIDMISMATCH_VALUE: return MSGRESOURCEIDMISMATCH;
			case MSGRESOURCEIDMISSING_VALUE: return MSGRESOURCEIDMISSING;
			case MSGRESOURCENOTALLOWED_VALUE: return MSGRESOURCENOTALLOWED;
			case MSGRESOURCEREQUIRED_VALUE: return MSGRESOURCEREQUIRED;
			case MSGRESOURCETYPEMISMATCH_VALUE: return MSGRESOURCETYPEMISMATCH;
			case MSGSORTUNKNOWN_VALUE: return MSGSORTUNKNOWN;
			case MSGTRANSACTIONDUPLICATEID_VALUE: return MSGTRANSACTIONDUPLICATEID;
			case MSGTRANSACTIONMISSINGID_VALUE: return MSGTRANSACTIONMISSINGID;
			case MSGUNHANDLEDNODETYPE_VALUE: return MSGUNHANDLEDNODETYPE;
			case MSGUNKNOWNCONTENT_VALUE: return MSGUNKNOWNCONTENT;
			case MSGUNKNOWNOPERATION_VALUE: return MSGUNKNOWNOPERATION;
			case MSGUNKNOWNTYPE_VALUE: return MSGUNKNOWNTYPE;
			case MSGUPDATED_VALUE: return MSGUPDATED;
			case MSGVERSIONAWARE_VALUE: return MSGVERSIONAWARE;
			case MSGVERSIONAWARECONFLICT_VALUE: return MSGVERSIONAWARECONFLICT;
			case MSGVERSIONAWAREURL_VALUE: return MSGVERSIONAWAREURL;
			case MSGWRONGNS_VALUE: return MSGWRONGNS;
			case SEARCHMULTIPLE_VALUE: return SEARCHMULTIPLE;
			case SEARCHNONE_VALUE: return SEARCHNONE;
			case UPDATEMULTIPLEMATCHES_VALUE: return UPDATEMULTIPLEMATCHES;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private OperationOutcomeCodesEnum(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //OperationOutcomeCodesEnum
