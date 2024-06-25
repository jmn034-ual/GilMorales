import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-avatar/src/vaadin-avatar.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@polymer/iron-icon/iron-icon.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';

@customElement('vista-lista-publicaciones-usuario-no-registrado-item')
export class VistaListaPublicacionesUsuarioNoRegistradoItem extends LitElement {
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
<vaadin-vertical-layout theme="spacing" id="publicacion" style="width: 100%; height: 100%; min-height: 100%; min-width: 100%;">
 <vaadin-horizontal-layout class="content" style="height: 100%; width: 100%; padding: 10px; min-width: 100%;" id="layoutPublicacion">
  <vaadin-vertical-layout id="vaadinVerticalLayout">
   <vaadin-vertical-layout theme="spacing-s" id="fotoPerfil">
    <vaadin-avatar id="vaadinAvatar"></vaadin-avatar>
   </vaadin-vertical-layout>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout id="layoutVideoPublicacion" style="flex-grow: 0; flex-shrink: 0; width: 1200px;">
   <vaadin-button theme="tertiary" id="botonNombreUsuario">
     NombreUsuario 
   </vaadin-button>
   <label id="labelGeolocalizacion">Geolocalización</label>
   <label id="numVisualizaciones" style="align-self: flex-end; padding-right: var(--lumo-space-xl);">0</label>
   <vaadin-vertical-layout id="layoutVideo" style="align-self: center; flex-grow: 0; flex-shrink: 0; width: 1000px; display: flex; justify-content: center; align-items: center; overflow: hidden; height: 700px; background-color: black;"></vaadin-vertical-layout>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout id="layoutDatos" style="justify-content: center; flex-grow: 0; flex-shrink: 0;">
   <vaadin-horizontal-layout theme="spacing" id="layoutBotonesUsuarioR" style="align-self: flex-end; justify-content: flex-end;">
    <vaadin-button id="botonSeguir">
      Seguir 
    </vaadin-button>
    <vaadin-button id="botonDenunciar">
      Denunciar 
    </vaadin-button>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout theme="spacing-xl" id="layoutBotonesPublicacion" style="align-self: flex-end; justify-content: center;">
    <vaadin-horizontal-layout theme="spacing" id="layaoutMeGustas">
     <label id="labelNumMeGustas" style="align-self: center; border-radius: 100px; border: 2px solid #F5F5F5; padding: var(--lumo-space-s); width: 20px; /* Ajusta la altura y el ancho para que sean iguales */
height: 100px; display: flex; /* Asegura que el contenido esté centrado si es necesario */
justify-content: center; align-items: center; height: 20px; justify-content: center; font-weight: bold;">0</label>
     <vaadin-button theme="icon" aria-label="Add new" id="vaadinButton" style="align-self: center; border-radius: 100px; border: 2px solid #F5F5F5; /* Ajusta la altura y el ancho para que sean iguales */
height: 100px; display: flex; /* Asegura que el contenido esté centrado si es necesario */
justify-content: center; align-items: center; justify-content: center; font-weight: bold; width: 50px; height: 50px; padding: 0px;">
      <iron-icon icon="vaadin:heart" id="ironIcon" style="height: 30px; width: 30px; color: black; align-self: center;"></iron-icon>
     </vaadin-button>
    </vaadin-horizontal-layout>
    <vaadin-horizontal-layout theme="spacing" id="layoutComentarios">
     <label id="labelNumComentarios" style="align-self: center; border-radius: 100px; border: 2px solid #F5F5F5; padding: var(--lumo-space-s); width: 20px; /* Ajusta la altura y el ancho para que sean iguales */
height: 100px; display: flex; /* Asegura que el contenido esté centrado si es necesario */
justify-content: center; align-items: center; height: 20px; justify-content: center; font-weight: bold;">0</label>
     <vaadin-button theme="icon" aria-label="Add new" id="botonVerComentarios" style="align-self: center; border-radius: 100px; border: 2px solid #F5F5F5; /* Ajusta la altura y el ancho para que sean iguales */
height: 100px; display: flex; /* Asegura que el contenido esté centrado si es necesario */
justify-content: center; align-items: center; justify-content: center; font-weight: bold; width: 50px; height: 50px; padding: 0px;">
      <iron-icon icon="vaadin:comments" id="ironIcon1" style="height: 30px; width: 30px; color: black; align-self: center;"></iron-icon>
     </vaadin-button>
    </vaadin-horizontal-layout>
   </vaadin-horizontal-layout>
   <vaadin-vertical-layout theme="spacing" style="width: 300px; height: 30%;" id="vaadinVerticalLayout1">
    <label id="labelDescripcion" style="flex-grow: 0; flex-shrink: 0; width: 100%; height: 100%; word-wrap: break-word; white-space: normal; overflow-wrap: break-word;">Descripción de la publicación...</label>
   </vaadin-vertical-layout>
   <vaadin-horizontal-layout theme="spacing-xs" id="layoutComentar" style="align-self: center;">
    <vaadin-text-field label="" placeholder="Escribe tu comentario..." id="textFieldComentario"></vaadin-text-field>
    <vaadin-button id="botonComentar">
      Comentar 
    </vaadin-button>
   </vaadin-horizontal-layout>
  </vaadin-vertical-layout>
 </vaadin-horizontal-layout>
 <hr id="lineaHorizontal" style="width: 99%; height: 2px;">
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
