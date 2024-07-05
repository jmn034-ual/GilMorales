import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-avatar/src/vaadin-avatar.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@polymer/iron-icon/iron-icon.js';

@customElement('vista-lista-comentarios-comercial-item')
export class VistaListaComentariosComercialItem extends LitElement {
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
<vaadin-horizontal-layout id="nombreDeUsuarioB" style="width: 100%;">
 <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout" style="align-self: center; justify-content: center; flex-shrink: 0;">
  <vaadin-avatar id="avatar"></vaadin-avatar>
 </vaadin-horizontal-layout>
 <vaadin-vertical-layout theme="spacing" id="vaadinVerticalLayout" style="width: 53%;">
  <vaadin-button theme="tertiary" id="nombreDeUsuarioB1" style="color: black; font-weight: bold;">
    Nombre de usuario 
  </vaadin-button>
  <label id="comentarioL" style="margin-left: var(--lumo-space-xs);">Comentario</label>
 </vaadin-vertical-layout>
 <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout1" style="flex-grow: 1; flex-shrink: 0; justify-content: flex-end; margin-right: var(--lumo-space-xs);">
  <label id="label" style="align-self: center; border-radius: 100px; border: 2px solid #F5F5F5; padding: var(--lumo-space-s); width: 20px; /* Ajusta la altura y el ancho para que sean iguales */
height: 100px; display: flex; /* Asegura que el contenido esté centrado si es necesario */
justify-content: center; align-items: center; height: 20px; justify-content: center; font-weight: bold;">0</label>
  <vaadin-button theme="icon" aria-label="Add new" style="align-self: center; border-radius: 100px; border: 2px solid #F5F5F5; height: 100px; display: flex; 
justify-content: center; align-items: center; justify-content: center; font-weight: bold; width: 50px; height: 50px; padding: 0px; color: red;">
   <iron-icon icon="vaadin:heart" style="color: black;"></iron-icon>
  </vaadin-button>
  <vaadin-button id="denunciarB" style="align-self: center; flex-grow: 0; flex-shrink: 0;" theme="primary error">
    Denunciar 
  </vaadin-button>
 </vaadin-horizontal-layout>
</vaadin-horizontal-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
