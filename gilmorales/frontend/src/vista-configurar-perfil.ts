import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-radio-button/src/vaadin-radio-group.js';
import '@vaadin/vaadin-radio-button/src/vaadin-radio-button.js';

@customElement('vista-configurar-perfil')
export class VistaConfigurarPerfil extends LitElement {
  static get styles() {
    return css`
      :host {
          display: block;
          height: 100%;
      }
      `;
  }

  render() {
    return html`
<vaadin-vertical-layout style="width: 100%; height: 100%;" id="vaadinVerticalLayout">
 <vaadin-horizontal-layout theme="spacing" id="cabecera" style="align-self: stretch;"></vaadin-horizontal-layout>
 <h1 id="titulo" style="align-self: center;">Configurar Perfil</h1>
 <vaadin-vertical-layout theme="spacing-xs" id="vaadinVerticalLayout1" style="align-self: center; flex-grow: 0;">
  <vaadin-vertical-layout id="layoutPrivacidad" style="flex-grow: 0;">
   <vaadin-horizontal-layout id="vaadinHorizontalLayout" style="align-self: flex-start; justify-content: flex-start;">
    <h4 id="tituloPrivacidad" style="margin: var(--lumo-space-xs);">Privacidad</h4>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout theme="spacing" id="layoutVisibilidad" style="margin: var(--lumo-space-s); align-self: stretch;">
    <label id="labelVisibilidad" style="align-self: flex-start;">Visibilidad:</label>
    <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout1">
     <vaadin-radio-group value="foo" id="radioGroupVisibilidad" style="align-self: center;">
      <vaadin-radio-button name="foo" id="radioBotonPrivada" checked>
       Privada
      </vaadin-radio-button>
      <vaadin-radio-button name="bar" id="radioBotonPublica" checked>
       Pública
      </vaadin-radio-button>
     </vaadin-radio-group>
    </vaadin-horizontal-layout>
   </vaadin-horizontal-layout>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout style="flex-grow: 0; align-self: stretch;" id="layoutNotificaciones">
   <vaadin-horizontal-layout style="align-self: flex-start; justify-content: flex-start;" id="vaadinHorizontalLayout2">
    <h4 style="margin: var(--lumo-space-xs);" id="tituloNotificaciones">Notificaciones</h4>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout theme="spacing" style="align-self: flex-start; margin: var(--lumo-space-s);" id="layoutPreferencias">
    <label id="labelPreferencias">Preferencias:</label>
    <vaadin-vertical-layout id="layoutCheckbox">
     <vaadin-checkbox id="checkboxMeGustas">
      Me Gustas
     </vaadin-checkbox>
     <vaadin-checkbox id="checkboxComentarios">
      Comentarios
     </vaadin-checkbox>
     <vaadin-checkbox id="checkboxNuevosSeguidores">
      Nuevos Seguidores
     </vaadin-checkbox>
     <vaadin-checkbox id="checkboxMenciones">
      Menciones y etiquetas
     </vaadin-checkbox>
    </vaadin-vertical-layout>
   </vaadin-horizontal-layout>
  </vaadin-vertical-layout>
  <vaadin-horizontal-layout theme="spacing" id="layoutBotones" style="align-self: center;">
   <vaadin-button id="botonRestaurar">
    Restaurar Preferencias
   </vaadin-button>
   <vaadin-button id="botonGuardar">
    Guardar
   </vaadin-button>
  </vaadin-horizontal-layout>
 </vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
